package id.ac.unhas.moviecatalog.ui.detail

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import id.ac.unhas.moviecatalog.R
import id.ac.unhas.moviecatalog.data.DetailShow
import id.ac.unhas.moviecatalog.databinding.ActivityDetailBinding
import id.ac.unhas.moviecatalog.databinding.ContentDetailBinding
import id.ac.unhas.moviecatalog.utils.ViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class DetailActivity : AppCompatActivity(), KodeinAware {

    private lateinit var detailBinding: ContentDetailBinding
    override val kodein: Kodein by kodein()
    private val factory: ViewModelFactory by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        detailBinding = activityDetailBinding.detailContent

        setContentView(activityDetailBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(
            this,
            factory
        )[DetailViewModel::class.java]

        val getMovieId = intent.getIntExtra(EXTRA_MOVIE, 0)
        val getTVShowId = intent.getIntExtra(EXTRA_TVSHOW, 0)

        when (val getIdentifier = intent.getIntExtra(EXTRA_IDENTIFIER, 0)) {
            1 -> {
                viewModel.getMovie(getMovieId).observe(this, Observer { showDetail(it) })
                Log.i("DETAIL", "$getIdentifier; $getMovieId; $getTVShowId")
            }
            2 -> {
                viewModel.getTVShow(getTVShowId).observe(this, Observer { showDetail(it) })
                Log.i("DETAIL", "$getIdentifier; $getMovieId; $getTVShowId")
            }
        }
    }

    private fun showDetail(show: DetailShow) {
        with(detailBinding) {
            textTitle.text = show.title
            year.text = show.year
            textDescription.text = show.description

            Glide.with(this@DetailActivity)
                .asBitmap()
                .load("https://image.tmdb.org/t/p/w500" + show.image)
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .into(object : CustomTarget<Bitmap>() {
                    override fun onResourceReady(
                        resource: Bitmap,
                        transition: Transition<in Bitmap>?
                    ) {
                        imagePosterDetail.setImageBitmap(resource)
                    }

                    override fun onLoadCleared(placeholder: Drawable?) {
                        imagePosterDetail.background = placeholder
                    }
                })
        }

    }


    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TVSHOW = "extra_tv"
        const val EXTRA_IDENTIFIER = "extra_identity"
    }
}
