package id.ac.unhas.moviecatalog.data.source.local.room

import android.database.Cursor
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface FavoriteDao {

    // movie
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addToFavoriteMovie(favoriteMovieEntity: FavoriteMovieEntity)

    @Query("SELECT * FROM favorite_movie")
    fun getFavoriteMovie(): LiveData<List<FavoriteMovieEntity>>

    @Query("SELECT * FROM favorite_movie WHERE movieId = :movieId")
    suspend fun getMovieById(movieId: Int) : Int

    @Query("DELETE FROM favorite_movie WHERE movieId = :movieId")
    suspend fun removeFromFavoriteMovie(movieId: Int) : Int

    @Query("SELECT * FROM favorite_movie")
    fun findAllMovie(): Cursor

    //tv show
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addToFavoriteTVShow(favoriteTVShowEntity: FavoriteTVShowEntity)

    @Query("SELECT * FROM favorite_tv_show")
    fun getFavoriteTVShow(): LiveData<List<FavoriteTVShowEntity>>

    @Query("SELECT * FROM favorite_tv_show WHERE tvId = :tvId")
    suspend fun getTVShowById(tvId: Int) : Int

    @Query("DELETE FROM favorite_tv_show WHERE tvId = :tvId")
    suspend fun removeFromFavoriteTVShow(tvId: Int) : Int

    @Query("SELECT * FROM favorite_tv_show")
    fun findAllTVShow(): Cursor

}