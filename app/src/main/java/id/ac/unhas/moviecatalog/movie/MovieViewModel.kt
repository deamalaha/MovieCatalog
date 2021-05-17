package id.ac.unhas.moviecatalog.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.repo.Repository
import id.ac.unhas.moviecatalog.data.source.local.MovieAndShowEntity

class MovieViewModel constructor(private val repository: Repository) : ViewModel() {

    fun getMovie(): LiveData<List<MovieAndShowEntity>> = repository.getMovies()
}