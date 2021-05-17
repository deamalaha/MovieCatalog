package id.ac.unhas.moviecatalog.data.repo

import androidx.lifecycle.LiveData
import id.ac.unhas.moviecatalog.data.source.local.LocalDataSource
import id.ac.unhas.moviecatalog.data.source.local.MovieAndShowEntity
import id.ac.unhas.moviecatalog.data.source.remote.RemoteDataSource

class Repository private constructor(private val remoteDataSource: RemoteDataSource) :
    LocalDataSource {

    companion object {
        @Volatile
        private var instance: Repository? = null

        fun getInstance(remoteData: RemoteDataSource): Repository =
            instance ?: synchronized(this) {
                Repository(remoteData).apply { instance = this }

            }
    }


    override fun getMovies(): LiveData<List<MovieAndShowEntity>> {
        return remoteDataSource.getMovies()
    }

    override fun getTVShow(): LiveData<List<MovieAndShowEntity>> {
        return remoteDataSource.getTVShow()
    }

    override fun getShow(title: String): LiveData<MovieAndShowEntity> {
        TODO("Not yet implemented")
    }


}