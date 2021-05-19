package id.ac.unhas.moviecatalog.data.source.remote

import android.util.Log
import id.ac.unhas.moviecatalog.data.Movie
import id.ac.unhas.moviecatalog.data.source.remote.network.API
import id.ac.unhas.moviecatalog.data.source.remote.network.ApiConfig
import id.ac.unhas.moviecatalog.data.source.remote.response.*
import id.ac.unhas.moviecatalog.utils.EspressoIdlingResource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource {

    companion object {
        private const val API_KEY = "a1f957ee816ee92cd4274d1a51d544b9"
    }

    fun getAllPopularMovie(callback: LoadPopularMovie){
        EspressoIdlingResource.increment()

        val client = ApiConfig.getApiService().getPopularMovie(API_KEY)
        client.enqueue(object : Callback<MoviePopularResponse> {
            override fun onResponse(
                call: Call<MoviePopularResponse>,
                response: Response<MoviePopularResponse>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let { callback.onAllPopularMovie(it.results) }
                    EspressoIdlingResource.decrement()
                }
            }

            override fun onFailure(call: Call<MoviePopularResponse>, t: Throwable) {
                Log.e("RemoteDataSource : ", "getPopularMovie Error : ${t.message}")
                EspressoIdlingResource.decrement()
            }
        })
    }

    fun getAllPopularTVShow(callback : LoadPopularTVShow) {
        EspressoIdlingResource.increment()

        val client = ApiConfig.getApiService().getPopularTVShow(API_KEY)
        client.enqueue(object : Callback<TVShowPopularResponse> {
            override fun onResponse(
                call: Call<TVShowPopularResponse>,
                response: Response<TVShowPopularResponse>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let { callback.onAllPopularTVShow(it.results) }
                    EspressoIdlingResource.decrement()
                }
            }

            override fun onFailure(call: Call<TVShowPopularResponse>, t: Throwable) {
                Log.e("RemoteDataSource : ", "getPopularTVShow Error : ${t.message}")
                EspressoIdlingResource.decrement()
            }
        })
    }

    fun getDetailMovie(movieId: Int, callback: LoadDetailMovie) {
        EspressoIdlingResource.increment()

        val client = ApiConfig.getApiService().getDetailMovie(movieId, API_KEY)
        client.enqueue(object : Callback<MoviePopular> {
            override fun onResponse(call: Call<MoviePopular>, response: Response<MoviePopular>) {
                if (response.isSuccessful) {
                    response.body()?.let { callback.onDetailMovie(it) }
                    EspressoIdlingResource.decrement()
                }
            }

            override fun onFailure(call: Call<MoviePopular>, t: Throwable) {
                Log.e("RemoteDataSource : ", "getDetailMovie Error : ${t.message}")
                EspressoIdlingResource.decrement()
            }

        })
    }

    fun getDetailTVShow(tvId: Int, callback: LoadDetailTVShow) {
        EspressoIdlingResource.increment()

        val client = ApiConfig.getApiService().getDetailTVShow(tvId, API_KEY)
        client.enqueue(object : Callback<TVShowPopular> {
            override fun onResponse(
                call: Call<TVShowPopular>,
                response: Response<TVShowPopular>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let { callback.onDetailTVShow(it) }
                    EspressoIdlingResource.decrement()
                }
            }

            override fun onFailure(call: Call<TVShowPopular>, t: Throwable) {
                Log.e("RemoteDataSource : ", "getDetailTVShow Error : ${t.message}")
                EspressoIdlingResource.decrement()
            }

        })
    }

    interface LoadPopularMovie {
        fun onAllPopularMovie(popularMovie: List<MoviePopular>?)
    }

    interface LoadPopularTVShow {
        fun onAllPopularTVShow(popularTVShow: List<TVShowPopular>?)
    }

    interface LoadDetailMovie {
        fun onDetailMovie (detailMovie: MoviePopular)
    }

    interface LoadDetailTVShow {
        fun onDetailTVShow (detailTVShowResponse: TVShowPopular)
    }
}