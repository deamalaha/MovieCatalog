package id.ac.unhas.moviecatalog.data.source

import androidx.lifecycle.LiveData
import id.ac.unhas.moviecatalog.data.*

interface MovieAndShowDataSource {
    fun getPopularMovie(): LiveData<List<Movie>>

    fun getPopularTVShow(): LiveData<List<TVShow>>

    fun getDetailMovie(movieId: Int): LiveData<DetailShow>

    fun getDetailTVShow(tvId: Int): LiveData<DetailShow>
}