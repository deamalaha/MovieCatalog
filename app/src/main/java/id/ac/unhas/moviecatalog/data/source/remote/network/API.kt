package id.ac.unhas.moviecatalog.data.source.remote.network

import id.ac.unhas.moviecatalog.data.source.remote.response.DetailMovieResponse
import id.ac.unhas.moviecatalog.data.source.remote.response.DetailTVShowResponse
import id.ac.unhas.moviecatalog.data.source.remote.response.MoviePopularResponse
import id.ac.unhas.moviecatalog.data.source.remote.response.TVShowPopularResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface API {

    @GET("movie/popular")
    fun getPopularMovie(
        @Query("api_key") apiKey: String
    ): Call<MoviePopularResponse>

    @GET("tv/popular")
    fun getPopularTVShow(
        @Query("api_key") apiKey: String
    ): Call<TVShowPopularResponse>

    @GET("movie/{movie_id}")
    fun getDetailMovie(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String
    ): Call<DetailMovieResponse>

    @GET("tv/{tv_id}")
    fun getDetailTVShow(
        @Path("tv_id") tvId: Int,
        @Query("api_key") apiKey: String
    ): Call<DetailTVShowResponse>

}
