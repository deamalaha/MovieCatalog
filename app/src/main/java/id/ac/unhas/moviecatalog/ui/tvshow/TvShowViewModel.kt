package id.ac.unhas.moviecatalog.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.ac.unhas.moviecatalog.data.TVShow
import id.ac.unhas.moviecatalog.data.source.Repository

class TvShowViewModel (private val tvShowRepository: Repository): ViewModel() {

    fun getTvShow(): LiveData<List<TVShow>> = tvShowRepository.getPopularTVShow()
}