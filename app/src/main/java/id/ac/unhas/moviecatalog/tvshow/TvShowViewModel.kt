package id.ac.unhas.moviecatalog.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.repo.Repository
import id.ac.unhas.moviecatalog.data.source.local.MovieAndShowEntity

class TvShowViewModel constructor(private val repository: Repository) : ViewModel() {

    fun getTvShow(): LiveData<List<MovieAndShowEntity>> = repository.getTVShow()
}