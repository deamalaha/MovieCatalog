package id.ac.unhas.moviecatalog.ui.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.unhas.moviecatalog.databinding.ActivityFavoriteBinding

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}