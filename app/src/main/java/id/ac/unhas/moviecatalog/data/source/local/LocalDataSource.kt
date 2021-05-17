package id.ac.unhas.moviecatalog.data.source.local

import androidx.lifecycle.LiveData

interface LocalDataSource {
    fun getMovies(): LiveData<List<MovieAndShowEntity>>

    fun getTVShow(): LiveData<List<MovieAndShowEntity>>

    fun getShow(title: String): LiveData<MovieAndShowEntity>
}