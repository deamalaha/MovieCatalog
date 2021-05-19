package id.ac.unhas.moviecatalog.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.*
import id.ac.unhas.moviecatalog.data.source.Repository

class DetailViewModel (private var detailRepository: Repository): ViewModel() {
    
    fun getMovie(movieId: Int): LiveData<DetailShow> = detailRepository.getDetailMovie(movieId)

    fun getTVShow(tvId: Int): LiveData<DetailShow> = detailRepository.getDetailTVShow(tvId)
}