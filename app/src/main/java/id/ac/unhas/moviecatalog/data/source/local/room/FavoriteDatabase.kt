package id.ac.unhas.moviecatalog.data.source.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(
    entities = [FavoriteMovieEntity::class, FavoriteTVShowEntity::class],
    version = 1
)
abstract class FavoriteDatabase : RoomDatabase() {

    companion object {
        var INSTANCE : FavoriteDatabase? = null

        fun getInstance(context: Context): FavoriteDatabase? {
            if (INSTANCE == null) {
                synchronized(FavoriteDatabase::class){
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        FavoriteDatabase::class.java,
                        "favorite_database"
                    ).build()
                }
            }
            return INSTANCE
        }
    }

    abstract fun favoriteDao() : FavoriteDao
}