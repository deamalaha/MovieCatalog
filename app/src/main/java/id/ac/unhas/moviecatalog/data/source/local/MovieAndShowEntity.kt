package id.ac.unhas.moviecatalog.data.source.local

import com.google.gson.annotations.SerializedName

data class MovieAndShowEntity (

    @SerializedName("title")
    val title : String,

    @SerializedName("release_date", alternate = ["first_air_date"])
    val year: String,

    @SerializedName("genre_ids")
    val genre: String,

    @SerializedName("overview")
    val description: String,

    @SerializedName("poster_path")
    val image: Int
)