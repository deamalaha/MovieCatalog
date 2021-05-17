package id.ac.unhas.moviecatalog.data.source.remote.response

import com.google.gson.annotations.SerializedName
import id.ac.unhas.moviecatalog.data.source.local.MovieAndShowEntity

data class TVShowListResponse(
    @SerializedName("results")
    val results: MutableList<MovieAndShowEntity>
)