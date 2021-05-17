package id.ac.unhas.moviecatalog.detail

import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.source.local.Data
import id.ac.unhas.moviecatalog.data.source.local.MovieAndShowEntity
import id.ac.unhas.moviecatalog.data.repo.Repository

class DetailViewModel constructor(private val repository: Repository): ViewModel() {

    private lateinit var title: String

    fun setSelectedShow(title: String) {
        this.title = title
    }

    fun getShow(): MovieAndShowEntity {
        val data = Data.generateMovies() + Data.generateTvShows()
        return data.first { it.title == title}
    }
}