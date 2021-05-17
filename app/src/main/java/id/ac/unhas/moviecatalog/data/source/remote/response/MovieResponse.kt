package id.ac.unhas.moviecatalog.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(

    @field:SerializedName("overview")
    val description: String,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("genre_ids")
    val genre: List<Int>,

    @field:SerializedName("poster_path")
    val imagePath: String,

    @field:SerializedName("release_date")
    val releaseDate: String,

    )

