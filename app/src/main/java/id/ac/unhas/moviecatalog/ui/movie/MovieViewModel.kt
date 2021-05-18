package id.ac.unhas.moviecatalog.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.Movie
import id.ac.unhas.moviecatalog.data.source.Repository

class MovieViewModel (private val movieRepository: Repository): ViewModel() {

    fun getMovie(): LiveData<List<Movie>> = movieRepository.getPopularMovie()
}