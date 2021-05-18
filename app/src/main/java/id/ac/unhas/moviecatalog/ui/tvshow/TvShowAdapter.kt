package id.ac.unhas.moviecatalog.ui.tvshow

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
import id.ac.unhas.moviecatalog.data.TVShow
import id.ac.unhas.moviecatalog.databinding.ItemsTvShowBinding
import id.ac.unhas.moviecatalog.ui.detail.DetailActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.MainViewHolder>() {

    private val listTvShow = ArrayList<TVShow>()

    fun setShow(show: List<TVShow>?) {
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
        fun bind(show: TVShow) {
            with(binding) {
                tvItemTitle.text = show.title
                tvItemYear.text = show.year
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_ID, show.tvId)
                        putExtra(DetailActivity.EXTRA_IDENTIFIER, 2)
                    }
                    itemView.context.startActivity(intent)
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
}
