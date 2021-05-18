package id.ac.unhas.moviecatalog.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.*
import id.ac.unhas.moviecatalog.data.source.Repository

class DetailViewModel (private var detailRepository: Repository): ViewModel() {

    private var movieId: Int = 0
    private var tvId: Int = 0

    fun setSelectedShow(id : Int) {
        if (id == movieId) {
            this.movieId = id
        } else {
            this.tvId = id
        }
    }
    fun getMovie(movieId: Int): LiveData<DetailShow> = detailRepository.getDetailMovie(movieId)

    fun getTVShow(tvId: Int): LiveData<DetailShow> = detailRepository.getDetailTVShow(tvId)
}