package id.ac.unhas.moviecatalog.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.verify
import id.ac.unhas.moviecatalog.data.DetailShow
import id.ac.unhas.moviecatalog.data.source.Repository
import id.ac.unhas.moviecatalog.ui.detail.DetailViewModel
import id.ac.unhas.moviecatalog.utils.Data
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
class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = Data.generateMovies()[0]
    private val dummyTvShow = Data.generateTvShows()[0]
    private val dummyDetailMovie = Data.generateDummyDetailMovie()[0]
    private val dummyDetailTV = Data.generateDummyDetailTVShow()[0]

    private val movieId = dummyMovie.movieId
    private val tvId = dummyTvShow.tvId

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var observer: Observer<DetailShow>

    @Before
    fun setUp() {
        viewModel = DetailViewModel(repository)
    }

    @Test
    fun getShowMovie() {
        val movie = MutableLiveData<DetailShow>()
        movie.value = dummyDetailMovie

        Mockito.`when`(repository.getDetailMovie(movieId)).thenReturn(movie)

        val movieEntity = viewModel.getMovie(movieId).value as DetailShow
        verify(repository).getDetailMovie(movieId)

        assertNotNull(movieEntity)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.image, movieEntity.image)
        assertEquals(dummyMovie.description, movieEntity.description)
        assertEquals(dummyMovie.year, movieEntity.year)

        viewModel.getMovie(movieId).observeForever(observer)
        verify(observer).onChanged(dummyDetailMovie)

    }


    @Test
    fun getShowTVShow() {
        val tvshow = MutableLiveData<DetailShow>()
        tvshow.value = dummyDetailTV

        Mockito.`when`(repository.getDetailTVShow(tvId)).thenReturn(tvshow)
        val tvShowEntity = viewModel.getTVShow(tvId).value as DetailShow
        verify(repository).getDetailTVShow(tvId)

        assertNotNull(tvShowEntity)
        assertEquals(dummyTvShow.title, tvShowEntity.title)
        assertEquals(dummyTvShow.image, tvShowEntity.image)
        assertEquals(dummyTvShow.description, tvShowEntity.description)
        assertEquals(dummyTvShow.year, tvShowEntity.year)

        viewModel.getTVShow(tvId).observeForever(observer)
        verify(observer).onChanged(dummyDetailTV)

    }
}

