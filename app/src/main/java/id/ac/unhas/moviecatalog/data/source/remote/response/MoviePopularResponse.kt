package id.ac.unhas.moviecatalog.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MoviePopularResponse(

    @field:SerializedName("results")
    val results: List<MoviePopular>

)

data class MoviePopular(

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("release_date")
    val releaseDate: String,

    @field:SerializedName("overview")
    val overview: String,

    @field:SerializedName("poster_path")
    val posterPath: String

    )
