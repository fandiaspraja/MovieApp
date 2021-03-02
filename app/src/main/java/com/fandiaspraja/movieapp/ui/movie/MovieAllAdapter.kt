package com.fandiaspraja.movieapp.ui.movie

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.databinding.ItemAllBinding
import com.fandiaspraja.movieapp.ui.detailmovie.MovieDetailActivity

class MovieAllAdapter: RecyclerView.Adapter<MovieAllAdapter.MovieAllViewHolder>() {

    private var listMovieAll = ArrayList<MovieEntity>()

    fun setMovieAll(movieAll: List<MovieEntity>?) {
        if (movieAll == null) return
        this.listMovieAll.clear()
        this.listMovieAll.addAll(movieAll)
    }

    class MovieAllViewHolder(private val binding: ItemAllBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(movieEntity: MovieEntity){
            with(binding){
                Glide
                    .with(root)
                    .load(movieEntity.imgMovie)
                    .centerCrop()
                    .into(imgAll)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, MovieDetailActivity::class.java)
                    intent.putExtra("idMovie", movieEntity.id)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAllViewHolder {
        val itemsMovieAllBinding = ItemAllBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieAllViewHolder(itemsMovieAllBinding)
    }

    override fun getItemCount(): Int = listMovieAll.size

    override fun onBindViewHolder(holder: MovieAllViewHolder, position: Int) {
        val movieBanner = listMovieAll[position]
        holder.bind(movieBanner)
    }
}