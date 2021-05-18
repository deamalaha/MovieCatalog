package id.ac.unhas.moviecatalog.ui.tvshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import id.ac.unhas.moviecatalog.databinding.FragmentTvShowBinding
import id.ac.unhas.moviecatalog.utils.ViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance

class TvShowFragment : Fragment(), KodeinAware {

    private lateinit var fragmentTvShowBinding: FragmentTvShowBinding
    override val kodein: Kodein by kodein()
    private val factory: ViewModelFactory by instance()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentTvShowBinding = FragmentTvShowBinding.inflate(inflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]

            val adapter = TvShowAdapter()

            this.lifecycleScope.launchWhenStarted {
                viewModel.getTvShow().observe(viewLifecycleOwner, Observer {
                    fragmentTvShowBinding.progressBar.visibility = View.GONE

                    adapter.setShow(it)
                    adapter.notifyDataSetChanged()
                })
            }

            with(fragmentTvShowBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }
}
