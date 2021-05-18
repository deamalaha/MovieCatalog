package id.ac.unhas.moviecatalog.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class DetailTVShowResponse(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("number_of_seasons")
	val numberOfSeasons: Int,

	@field:SerializedName("first_air_date")
	val firstAirDate: String,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("poster_path")
	val posterPath: String,

	@field:SerializedName("name")
	val name: String

)
