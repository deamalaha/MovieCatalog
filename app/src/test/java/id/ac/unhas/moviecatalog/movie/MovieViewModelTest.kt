package id.ac.unhas.moviecatalog.movie

import id.ac.unhas.moviecatalog.utils.Data
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.verify
import id.ac.unhas.moviecatalog.data.Movie
import id.ac.unhas.moviecatalog.data.source.Repository
import id.ac.unhas.moviecatalog.ui.movie.MovieViewModel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var observer: Observer<List<Movie>>

    @Before
    fun setUp() {
        viewModel = MovieViewModel(repository)
    }

    @Test
    fun getMovie() {
        val dummyMovie = Data.generateMovies()
        val movie = MutableLiveData<List<Movie>>()
        movie.value = dummyMovie

        `when`(repository.getPopularMovie()).thenReturn(movie)
        val movieEntities = viewModel.getMovie().value
        verify(repository).getPopularMovie()
        assertNotNull(movieEntities)
        assertEquals(10, movieEntities?.size)

        viewModel.getMovie().observeForever(observer)
        verify(observer).onChanged(dummyMovie)

    }
}