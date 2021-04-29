package id.ac.unhas.moviecatalog.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.unhas.moviecatalog.databinding.ActivityDetailBinding
import id.ac.unhas.moviecatalog.databinding.ContentDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var detailBinding: ContentDetailBinding

    companion object {
        val EXTRA_SHOW = "extra_show"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        detailBinding = activityDetailBinding.detailContent

        setContentView(activityDetailBinding.root)
        setSupportActionBar(activityDetailBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}