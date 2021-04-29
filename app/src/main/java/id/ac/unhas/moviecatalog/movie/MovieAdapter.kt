package id.ac.unhas.moviecatalog.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.ac.unhas.moviecatalog.R
import id.ac.unhas.moviecatalog.data.MovieAndShowEntity
import id.ac.unhas.moviecatalog.databinding.ItemsMovieBinding
import id.ac.unhas.moviecatalog.detail.DetailActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MainViewHolder>() {

    private val listMovie = ArrayList<MovieAndShowEntity>()

    fun setShow(show: List<MovieAndShowEntity>?) {
        if (show == null) return
        this.listMovie.clear()
        this.listMovie.addAll(show)
    }

    class MainViewHolder(private val binding: ItemsMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(show: MovieAndShowEntity) {
            with(binding) {
                tvItemTitle.text = show.title
                tvItemYear.text = show.year
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_SHOW, show.title)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(show.image)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .into(imgPoster)
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