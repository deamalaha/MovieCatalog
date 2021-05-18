package id.ac.unhas.moviecatalog.di


import android.app.Application
import id.ac.unhas.moviecatalog.data.source.Repository
import id.ac.unhas.moviecatalog.data.source.remote.RemoteDataSource
import id.ac.unhas.moviecatalog.ui.detail.DetailViewModel
import id.ac.unhas.moviecatalog.ui.movie.MovieViewModel
import id.ac.unhas.moviecatalog.ui.tvshow.TvShowViewModel
import id.ac.unhas.moviecatalog.utils.ViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class KodeinInjection : Application() , KodeinAware {

    override val kodein: Kodein = Kodein.lazy {
        import(androidXModule(this@KodeinInjection))

        bind() from this.provider {
            RemoteDataSource()
        }

        bind() from this.provider {
            Repository(this.instance())
        }

        bind() from this.provider {
            DetailViewModel(this.instance())
        }

        bind() from this.provider {
            MovieViewModel(this.instance())
        }

        bind() from this.provider {
            TvShowViewModel(this.instance())
        }

        bind() from this.singleton {
            ViewModelFactory(this.instance())
        }
    }

}


