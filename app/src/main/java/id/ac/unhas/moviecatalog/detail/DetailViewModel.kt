package id.ac.unhas.moviecatalog.detail

import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.Data
import id.ac.unhas.moviecatalog.data.MovieAndShowEntity

class DetailViewModel : ViewModel() {

    private lateinit var title: String

    fun setSelectedShow(title: String) {
        this.title = title
    }

    fun getShow(): MovieAndShowEntity {
        val data = Data.generateMovies() + Data.generateTvShows()
        return data.first { it.title == title}
    }
}