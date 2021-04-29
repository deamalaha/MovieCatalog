package id.ac.unhas.moviecatalog.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.ac.unhas.moviecatalog.R
import id.ac.unhas.moviecatalog.data.MovieAndShowEntity
import id.ac.unhas.moviecatalog.databinding.ItemsTvShowBinding
import id.ac.unhas.moviecatalog.detail.DetailActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.MainViewHolder>() {

    private val listTvShow = ArrayList<MovieAndShowEntity>()

    fun setShow(show: List<MovieAndShowEntity>?) {
        if (show == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(show)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MainViewHolder {
        val itemTvShowBinding =
            ItemsTvShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainViewHolder(itemTvShowBinding)
    }

    override fun getItemCount(): Int = listTvShow.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val show = listTvShow[position]
        holder.bind(show)
    }

    class MainViewHolder(private val binding: ItemsTvShowBinding) :
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
}
