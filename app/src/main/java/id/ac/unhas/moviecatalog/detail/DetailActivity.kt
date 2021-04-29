package id.ac.unhas.moviecatalog.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import id.ac.unhas.moviecatalog.R
import id.ac.unhas.moviecatalog.data.Data
import id.ac.unhas.moviecatalog.data.MovieAndShowEntity
import id.ac.unhas.moviecatalog.databinding.ActivityDetailBinding
import id.ac.unhas.moviecatalog.databinding.ContentDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var detailBinding: ContentDetailBinding

    companion object {
        const val EXTRA_SHOW = "extra_show"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        detailBinding = activityDetailBinding.detailContent

        setContentView(activityDetailBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val extras = intent.extras
        if (extras != null) {
            val title = extras.getString(EXTRA_SHOW)
            if (title != null) {
                for (movie in Data.generateMovies()) {
                    if (movie.title == title) {
                        showDetail(movie)
                    }
                }

                for (tvShow in Data.generateTvShows()) {
                    if (tvShow.title == title) {
                        showDetail(tvShow)
                    }
                }
            }
        }
    }

    private fun showDetail(show: MovieAndShowEntity) {
        detailBinding.textTitle.text = show.title
        detailBinding.genre.text = show.genre
        detailBinding.year.text = show.year
        detailBinding.textDescription.text = show.description

        Glide.with(this)
            .load(show.image)
            .transform(RoundedCorners(20))
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
            .into(detailBinding.imagePosterDetail)
    }
}
