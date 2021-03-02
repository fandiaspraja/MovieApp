package com.fandiaspraja.movieapp.ui.movie

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.databinding.ItemBannerBinding
import com.fandiaspraja.movieapp.ui.detailmovie.MovieDetailActivity

class MovieBannerAdapter: RecyclerView.Adapter<MovieBannerAdapter.MovieBannerViewHolder>() {

    private var listMovieBanner = ArrayList<MovieEntity>()

    fun setMovieBanner(movieBanner: List<MovieEntity>?) {
        if (movieBanner == null) return
        this.listMovieBanner.clear()
        this.listMovieBanner.addAll(movieBanner)
    }

    class MovieBannerViewHolder(private val binding: ItemBannerBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(movieEntity: MovieEntity){
            with(binding){

                    Glide
                            .with(root)
                            .load(movieEntity.imgMovie)
                            .centerCrop()
                            .into(imgBanner)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, MovieDetailActivity::class.java)
                    intent.putExtra("idMovie", movieEntity.id)
                    itemView.context.startActivity(intent)
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieBannerViewHolder {
        val itemsMovieBannerBinding = ItemBannerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieBannerViewHolder(itemsMovieBannerBinding)
    }

    override fun getItemCount(): Int = listMovieBanner.size

    override fun onBindViewHolder(holder: MovieBannerViewHolder, position: Int) {
        val movieBanner = listMovieBanner[position]
        holder.bind(movieBanner)
    }
}