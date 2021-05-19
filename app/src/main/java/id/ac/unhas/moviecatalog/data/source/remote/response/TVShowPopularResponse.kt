package id.ac.unhas.moviecatalog.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class TVShowPopularResponse(

	@field:SerializedName("results")
	val results: List<TVShowPopular>

)

data class TVShowPopular(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("first_air_date")
	val firstAirDate: String,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("poster_path")
	val posterPath: String


)
