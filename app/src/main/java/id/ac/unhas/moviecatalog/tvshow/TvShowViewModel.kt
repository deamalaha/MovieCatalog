package id.ac.unhas.moviecatalog.tvshow

import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.Data
import id.ac.unhas.moviecatalog.data.MovieAndShowEntity

class TvShowViewModel : ViewModel() {

    fun getTvShow() : List<MovieAndShowEntity> = Data.generateTvShows()
}