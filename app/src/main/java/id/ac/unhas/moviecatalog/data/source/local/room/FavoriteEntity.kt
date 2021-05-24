package id.ac.unhas.moviecatalog.data.source.local.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity( tableName = "favorite_movie")
data class FavoriteMovieEntity (
    @PrimaryKey
    @ColumnInfo(name = "movieId")
    var movieId: Int,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "year")
    var year: String,

    @ColumnInfo(name = "desc")
    var description: String,

    @ColumnInfo(name = "image_path")
    var image: String
): Serializable

@Entity( tableName = "favorite_tv_show")
data class FavoriteTVShowEntity (

    @PrimaryKey
    @ColumnInfo(name = "tvId")
    var tvId: Int,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "year")
    var year: String,

    @ColumnInfo(name = "desc")
    var description: String,

    @ColumnInfo(name = "image_path")
    var image: String
): Serializable