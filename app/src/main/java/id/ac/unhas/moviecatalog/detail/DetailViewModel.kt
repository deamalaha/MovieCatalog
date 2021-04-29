package id.ac.unhas.moviecatalog.detail

import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.Data
import id.ac.unhas.moviecatalog.data.MovieAndShowEntity

class DetailViewModel : ViewModel() {

    private lateinit var title : String

    fun setSelectedShow(title : String) {
        this.title = title
    }

    fun getShow() : MovieAndShowEntity {
        lateinit var entity: MovieAndShowEntity
        for (movie in Data.generateMovies()) {
            if (movie.title == title) {
                entity = movie
            }
        }
        for (tvShow in Data.generateTvShows()) {
            if (tvShow.title == title) {
                entity = tvShow
            }
        }
        return entity
    }
}