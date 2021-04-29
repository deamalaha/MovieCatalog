package id.ac.unhas.moviecatalog.movie

import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.Data
import id.ac.unhas.moviecatalog.data.MovieAndShowEntity

class MovieViewModel : ViewModel() {

    fun getMovie(): List<MovieAndShowEntity> = Data.generateMovies()
}