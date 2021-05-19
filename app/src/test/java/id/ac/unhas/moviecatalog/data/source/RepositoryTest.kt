package id.ac.unhas.moviecatalog.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.doAnswer
import id.ac.unhas.moviecatalog.data.source.remote.RemoteDataSource
import id.ac.unhas.moviecatalog.utils.Data
import id.ac.unhas.moviecatalog.utils.LiveDataTestUtil
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class RepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private val remote = mock(RemoteDataSource::class.java)

    @Mock
    private val repository = FakeRepository(remote)

    private val movieResponses = Data.generateMovies()
    private val detailMovieResponse = Data.generateDummyDetailMovie()[0]
    private val movieId = detailMovieResponse.id

    private val tvShowResponse = Data.generateTvShows()
    private val detailTVShowResponse = Data.generateDummyDetailTVShow()[0]
    private val tvId = detailTVShowResponse.id

    private val popMovie = Data.generateDummyMoviePop()
    private val popTVShow = Data.generateDummyTVShowPop()

    private val dummyMovie = Data.generateDummyDummyMovie()
    private val dummyTV = Data.generateDummyDummyTV()

    @Test
    fun getPopularMovie() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadPopularMovie).onAllPopularMovie(popMovie)
            null
        }.`when`(remote).getAllPopularMovie(any())

        val movieEntity = LiveDataTestUtil.getValue(repository.getPopularMovie())
        verify(remote).getAllPopularMovie(any())

        Assert.assertNotNull(movieEntity)
        Assert.assertEquals(movieResponses.size.toLong(), movieEntity.size.toLong())
    }

    @Test
    fun getPopularTVShow() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadPopularTVShow).onAllPopularTVShow(
                popTVShow
            )
            null
        }.`when`(remote).getAllPopularTVShow(any())

        val tvShowEntity = LiveDataTestUtil.getValue(repository.getPopularTVShow())
        verify(remote).getAllPopularTVShow(any())

        Assert.assertNotNull(tvShowEntity)
        Assert.assertEquals(tvShowResponse.size.toLong(), tvShowEntity.size.toLong())
    }

    @Test
    fun getDetailMovie() {
        doAnswer { invocation ->
            (invocation.arguments[1] as RemoteDataSource.LoadDetailMovie).onDetailMovie(dummyMovie)
            null
        }.`when`(remote).getDetailMovie(eq(movieId), any())

        val movieEntity = LiveDataTestUtil.getValue(repository.getDetailMovie(movieId))
        verify(remote).getDetailMovie(movieId, any())

        Assert.assertNotNull(movieEntity)
        Assert.assertEquals(movieId, movieEntity.id)

    }


    @Test
    fun getDetailTVShow() {
        doAnswer { invocation ->
            (invocation.arguments[1] as RemoteDataSource.LoadDetailTVShow).onDetailTVShow(dummyTV)
            null
        }.`when`(remote).getDetailTVShow(tvId, any())


        val tvShowEntity = LiveDataTestUtil.getValue(repository.getDetailTVShow(tvId))
        verify(remote).getDetailTVShow(tvId, any())

        Assert.assertNotNull(tvShowEntity)
        Assert.assertEquals(tvId, tvShowEntity.id)
    }

}