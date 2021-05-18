package id.ac.unhas.moviecatalog.tvshow

import id.ac.unhas.moviecatalog.ui.tvshow.TvShowViewModel
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShow() {
        val tvSHowEntities = viewModel.getTvShow()
        assertNotNull(tvSHowEntities)
        assertEquals(10, tvSHowEntities.size)
    }
}