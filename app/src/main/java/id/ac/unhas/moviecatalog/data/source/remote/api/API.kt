package id.ac.unhas.moviecatalog.data.source.remote.api

import id.ac.unhas.moviecatalog.data.source.local.MovieAndShowEntity
import id.ac.unhas.moviecatalog.data.source.remote.response.MovieListResponse
import id.ac.unhas.moviecatalog.data.source.remote.response.MovieResponse
import id.ac.unhas.moviecatalog.data.source.remote.response.TVShowListResponse
import id.ac.unhas.moviecatalog.data.source.remote.response.TVShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface API {

    @GET("/movie/popular")
    fun getMovie(@Query ("api_key") api_key : String): Call<MovieListResponse>

    @GET("/tv/popular")
    fun getTVShow(@Query ("api_key") api_key : String): Call<TVShowListResponse>

    // idk what is ths two doing
    @GET("movie/{id}")
    fun getDetailMovie(@Path("id") id : Int, @Query("api_name") api_name : String) : Call<MovieResponse>

    @GET("tv/{id}")
    fun getDetailTVShow(@Path("id") id : Int, @Query("api_name") api_name : String) : Call<TVShowResponse>


}