package id.ac.unhas.moviecatalog.data

data class Movie(
    var movieId: Int,
    var title: String,
    var year: String,
    var description: String,
    var image: String
)

data class TVShow(
    var tvId: Int,
    var title: String,
    var year: String,
    var description: String,
    var image: String
)

data class DetailShow(
    var id: Int,
    var title: String,
    var year: String,
    var description: String,
    var image: String
)
