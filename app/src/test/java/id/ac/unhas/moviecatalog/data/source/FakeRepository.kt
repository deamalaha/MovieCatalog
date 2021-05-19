package id.ac.unhas.moviecatalog.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import id.ac.unhas.moviecatalog.data.DetailShow
import id.ac.unhas.moviecatalog.data.Movie
import id.ac.unhas.moviecatalog.data.TVShow
import id.ac.unhas.moviecatalog.data.source.remote.RemoteDataSource
import id.ac.unhas.moviecatalog.data.source.remote.response.MoviePopular
import id.ac.unhas.moviecatalog.data.source.remote.response.TVShowPopular

class FakeRepository(private val remoteDataSource: RemoteDataSource) : MovieAndShowDataSource {

    override fun getPopularMovie(): LiveData<List<Movie>> {
        val popularMovieResult = MutableLiveData<List<Movie>>()

        remoteDataSource.getAllPopularMovie(object : RemoteDataSource.LoadPopularMovie {
            override fun onAllPopularMovie(popularMovie: List<MoviePopular>?) {
                val movieList = ArrayList<Movie>()

                if (popularMovie != null) {
                    for (response in popularMovie) {
                        val movie = Movie(
                            response.id,
                            response.title,
                            response.releaseDate,
                            response.overview,
                            response.posterPath
                        )
                        movieList.add(movie)
                    }
                }
                popularMovieResult.postValue(movieList)
            }
        })
        return popularMovieResult
    }

    override fun getPopularTVShow(): LiveData<List<TVShow>> {
        val popularTVShowResult = MutableLiveData<List<TVShow>>()

        remoteDataSource.getAllPopularTVShow(object : RemoteDataSource.LoadPopularTVShow {
            override fun onAllPopularTVShow(popularTVShow: List<TVShowPopular>?) {
                val tvShowList = ArrayList<TVShow>()

                if (popularTVShow != null) {
                    for (response in popularTVShow) {
                        val tvShow = TVShow(
                            response.id,
                            response.name,
                            response.firstAirDate,
                            response.overview,
                            response.posterPath
                        )
                        tvShowList.add(tvShow)
                    }
                }
                popularTVShowResult.postValue(tvShowList)
            }
        })
        return popularTVShowResult
    }

    override fun getDetailMovie(movieId: Int): LiveData<DetailShow> {
        val detailMovieResult = MutableLiveData<DetailShow>()

        remoteDataSource.getDetailMovie(movieId, object : RemoteDataSource.LoadDetailMovie {
            override fun onDetailMovie(detailMovie: MoviePopular) {
                val movie = DetailShow(
                    detailMovie.id,
                    detailMovie.title,
                    detailMovie.releaseDate,
                    detailMovie.overview,
                    detailMovie.posterPath
                )
                detailMovieResult.postValue(movie)
            }
        })
        return detailMovieResult
    }

    override fun getDetailTVShow(tvId: Int): LiveData<DetailShow> {
        val detailTVShowResult = MutableLiveData<DetailShow>()

        remoteDataSource.getDetailTVShow(tvId, object : RemoteDataSource.LoadDetailTVShow {
            override fun onDetailTVShow(detailTVShowResponse: TVShowPopular) {
                val tvShow = DetailShow(
                    detailTVShowResponse.id,
                    detailTVShowResponse.name,
                    detailTVShowResponse.firstAirDate,
                    detailTVShowResponse.overview,
                    detailTVShowResponse.posterPath
                )
                detailTVShowResult.postValue(tvShow)
            }
        })
        return detailTVShowResult
    }
}