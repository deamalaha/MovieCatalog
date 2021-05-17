package id.ac.unhas.moviecatalog.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import id.ac.unhas.moviecatalog.data.source.local.MovieAndShowEntity
import id.ac.unhas.moviecatalog.data.source.remote.api.RetrofitClient
import id.ac.unhas.moviecatalog.data.source.remote.response.MovieListResponse
import id.ac.unhas.moviecatalog.data.source.remote.response.TVShowListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RemoteDataSource {

    companion object {
        const val API_KEY = "a1f957ee816ee92cd4274d1a51d544b9"
    }

    fun getMovies(): LiveData<List<MovieAndShowEntity>> {
        val listMovie = MutableLiveData<List<MovieAndShowEntity>>()

        RetrofitClient.apiInstance
            .getMovie(API_KEY)
            .enqueue(object : Callback<MovieListResponse> {
                override fun onResponse(
                    call: Call<MovieListResponse>,
                    response: Response<MovieListResponse>
                ) {
                    response.body()?.let { listMovie.postValue(it.results) }
                }

                override fun onFailure(call: Call<MovieListResponse>, t: Throwable) {
                    Log.d("Failed", t.message.toString())
                }
            })
        return listMovie
    }

    fun getTVShow(): LiveData<List<MovieAndShowEntity>> {
        val listTVShow = MutableLiveData<List<MovieAndShowEntity>>()

        RetrofitClient.apiInstance
            .getTVShow(API_KEY)
            .enqueue(object : Callback<TVShowListResponse> {
                override fun onResponse(
                    call: Call<TVShowListResponse>,
                    response: Response<TVShowListResponse>
                ) {
                    response.body()?.let { listTVShow.postValue(it.results) }
                }

                override fun onFailure(call: Call<TVShowListResponse>, t: Throwable) {
                    Log.d("Failed", t.message.toString())
                }

            })
        return listTVShow
    }

}
