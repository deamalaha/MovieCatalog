package id.ac.unhas.moviecatalog.detail

import id.ac.unhas.moviecatalog.data.source.local.Data
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = Data.generateMovies()[0]
    private val dummyTvShow = Data.generateTvShows()[0]

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
    }

    @Test
    fun getShowMovie() {
        viewModel.setSelectedShow(dummyMovie.title)
        val movieEntity = viewModel.getShow()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.image, movieEntity.image)
        assertEquals(dummyMovie.description, movieEntity.description)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.year, movieEntity.year)

    }

    @Test
    fun getShowTVShow() {
        viewModel.setSelectedShow(dummyTvShow.title)
        val tvShowEntity = viewModel.getShow()
        assertNotNull(tvShowEntity)
        assertEquals(dummyTvShow.title, tvShowEntity.title)
        assertEquals(dummyTvShow.image, tvShowEntity.image)
        assertEquals(dummyTvShow.description, tvShowEntity.description)
        assertEquals(dummyTvShow.genre, tvShowEntity.genre)
        assertEquals(dummyTvShow.year, tvShowEntity.year)
    }
}