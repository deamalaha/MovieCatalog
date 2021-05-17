package id.ac.unhas.moviecatalog.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class TVShowResponse(

    @field:SerializedName("overview")
    val description: String,

    @field:SerializedName("genre_ids")
    val genreIds: List<Int>,

    @field:SerializedName("poster_path")
    val imagePath: String,

    @field:SerializedName("name")
    val title: String,

    @field:SerializedName("first_air_date")
    val firstAirDate: String,

    )

