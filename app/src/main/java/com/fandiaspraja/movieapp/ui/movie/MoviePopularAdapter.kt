package com.fandiaspraja.movieapp.ui.movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.databinding.ItemBannerBinding
import com.fandiaspraja.movieapp.databinding.ItemPopularBinding
import com.fandiaspraja.movieapp.ui.detailmovie.MovieDetailActivity

class MoviePopularAdapter: RecyclerView.Adapter<MoviePopularAdapter.MoviePopularViewHolder>() {

    private var listMoviePopular = ArrayList<MovieEntity>()

    fun setMoviePopular(movieBanner: List<MovieEntity>?) {
        if (movieBanner == null) return
        this.listMoviePopular.clear()
        this.listMoviePopular.addAll(movieBanner)
    }

    class MoviePopularViewHolder(private val binding: ItemPopularBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(movieEntity: MovieEntity){
            with(binding){
                Glide
                    .with(root)
                    .load(movieEntity.imgMovie)
                    .centerCrop()
                    .into(imgPopular)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, MovieDetailActivity::class.java)
                    intent.putExtra("idMovie", movieEntity.id)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviePopularViewHolder {
        val itemsMoviePopularBinding = ItemPopularBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviePopularViewHolder(itemsMoviePopularBinding)
    }

    override fun getItemCount(): Int = listMoviePopular.size

    override fun onBindViewHolder(holder: MoviePopularViewHolder, position: Int) {
        val movieBanner = listMoviePopular[position]
        holder.bind(movieBanner)
    }
}