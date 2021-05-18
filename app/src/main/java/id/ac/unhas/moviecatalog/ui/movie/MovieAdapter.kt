package id.ac.unhas.moviecatalog.ui.movie

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import id.ac.unhas.moviecatalog.R
import id.ac.unhas.moviecatalog.data.Movie
import id.ac.unhas.moviecatalog.databinding.ItemsMovieBinding
import id.ac.unhas.moviecatalog.ui.detail.DetailActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MainViewHolder>() {

    private val listMovie = ArrayList<Movie>()

    fun setShow(show: List<Movie>?) {
        if (show == null) return
        listMovie.clear()
        listMovie.addAll(show)
    }

    class MainViewHolder(private val binding: ItemsMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(show: Movie) {
            with(binding) {
                tvItemTitle.text = show.title
                tvItemYear.text = show.year
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_ID, show.movieId)
                        putExtra(DetailActivity.EXTRA_IDENTIFIER, 1)
                    }
                    it.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .asBitmap()
                    .load("https://image.tmdb.org/t/p/w500" + show.image)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .into(object : CustomTarget<Bitmap>() {
                        override fun onResourceReady(
                            resource: Bitmap,
                            transition: Transition<in Bitmap>?
                        ) {
                            imgPoster.setImageBitmap(resource)
                        }

                        override fun onLoadCleared(placeholder: Drawable?) {
                            imgPoster.background = placeholder
                        }
                    })
            }

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MainViewHolder {
        val itemsMovieBinding =
            ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainViewHolder(
            itemsMovieBinding
        )
    }

    override fun getItemCount(): Int = listMovie.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val show = listMovie[position]
        holder.bind(show)
    }
}