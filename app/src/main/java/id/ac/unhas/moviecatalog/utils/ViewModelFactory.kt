package id.ac.unhas.moviecatalog.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.ac.unhas.moviecatalog.data.source.Repository
import id.ac.unhas.moviecatalog.ui.detail.DetailViewModel
import id.ac.unhas.moviecatalog.ui.movie.MovieViewModel
import id.ac.unhas.moviecatalog.ui.tvshow.TvShowViewModel

class ViewModelFactory (private val repository: Repository):
    ViewModelProvider.NewInstanceFactory() {

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return when {
                modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                    MovieViewModel(repository) as T
                }

                modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                    DetailViewModel(repository) as T
                }

                modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                    TvShowViewModel(repository) as T
                }

                else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
            }
        }

    }