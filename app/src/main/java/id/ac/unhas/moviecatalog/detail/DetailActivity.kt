package id.ac.unhas.moviecatalog.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import dagger.hilt.android.AndroidEntryPoint
import id.ac.unhas.moviecatalog.R
import id.ac.unhas.moviecatalog.data.source.local.MovieAndShowEntity
import id.ac.unhas.moviecatalog.databinding.ActivityDetailBinding
import id.ac.unhas.moviecatalog.databinding.ContentDetailBinding

@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {

    private lateinit var detailBinding: ContentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        detailBinding = activityDetailBinding.detailContent

        setContentView(activityDetailBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]

        val title = intent.extras?.getString(EXTRA_SHOW)
        if (title != null) {
            viewModel.setSelectedShow(title)
            showDetail(viewModel.getShow())
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

    companion object {
        const val EXTRA_SHOW = "extra_show"
    }
}
