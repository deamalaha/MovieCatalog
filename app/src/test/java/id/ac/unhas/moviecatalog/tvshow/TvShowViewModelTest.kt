package id.ac.unhas.moviecatalog.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.verify
import id.ac.unhas.moviecatalog.data.TVShow
import id.ac.unhas.moviecatalog.data.source.Repository
import id.ac.unhas.moviecatalog.ui.tvshow.TvShowViewModel
import id.ac.unhas.moviecatalog.utils.Data
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var observer: Observer<List<TVShow>>

    @Before
    fun setUp() {
        viewModel = TvShowViewModel(repository)
    }

    @Test
    fun getTvShow() {
        runBlocking {
            val dummyTVShow = Data.generateTvShows()
            val tvShow = MutableLiveData<List<TVShow>>()
            tvShow.value = dummyTVShow


            Mockito.`when`(repository.getPopularTVShow()).thenReturn(tvShow)
            val tvShowEntities = viewModel.getTvShow().value
            assertNotNull(tvShowEntities)
            assertEquals(10, tvShowEntities?.size)

            viewModel.getTvShow().observeForever(observer)
            verify(observer).onChanged(dummyTVShow)
        }
    }
}