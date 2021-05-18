package id.ac.unhas.moviecatalog.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import id.ac.unhas.moviecatalog.databinding.FragmentMovieBinding
import id.ac.unhas.moviecatalog.utils.ViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance

class MovieFragment : Fragment(), KodeinAware {

    private lateinit var fragmentMovieBinding: FragmentMovieBinding
    override val kodein: Kodein by kodein()
    private val factory : ViewModelFactory by instance()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentMovieBinding = FragmentMovieBinding.inflate(inflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]

            val adapter = MovieAdapter()

            this.lifecycleScope.launchWhenStarted {
                viewModel.getMovie().observe(viewLifecycleOwner, Observer {
                    fragmentMovieBinding.progressBar.visibility = View.GONE

                    adapter.setShow(it)
                    adapter.notifyDataSetChanged()
                })
            }

            with(fragmentMovieBinding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }

}