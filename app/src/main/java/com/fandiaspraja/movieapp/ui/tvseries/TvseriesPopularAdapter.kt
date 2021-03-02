package com.fandiaspraja.movieapp.ui.tvseries

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fandiaspraja.movieapp.data.TvseriesEntity
import com.fandiaspraja.movieapp.databinding.ItemPopularBinding
import com.fandiaspraja.movieapp.ui.detailtvseries.TvseriesDetailActivity

class TvseriesPopularAdapter: RecyclerView.Adapter<TvseriesPopularAdapter.TvseriesPopularViewHolder>() {

    private var listTvseriesPopular = ArrayList<TvseriesEntity>()

    fun setTvseriesPopular(tvseriesBanner: List<TvseriesEntity>?) {
        if (tvseriesBanner == null) return
        this.listTvseriesPopular.clear()
        this.listTvseriesPopular.addAll(tvseriesBanner)
    }

    class TvseriesPopularViewHolder(private val binding: ItemPopularBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(tvseriesEntity: TvseriesEntity){
            with(binding){
                Glide
                        .with(root)
                        .load(tvseriesEntity.imgMovie)
                        .centerCrop()
                        .into(imgPopular)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, TvseriesDetailActivity::class.java)
                    val bundle = Bundle()
                    bundle.putSerializable("DETAIL_TVSERIES", tvseriesEntity)
                    intent.putExtras(bundle)
                    intent.putExtra("idTvseries", tvseriesEntity.id)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvseriesPopularViewHolder {
        val itemsMoviePopularBinding = ItemPopularBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvseriesPopularViewHolder(itemsMoviePopularBinding)
    }

    override fun getItemCount(): Int = listTvseriesPopular.size

    override fun onBindViewHolder(holder: TvseriesPopularViewHolder, position: Int) {
        val tvseriesBanner = listTvseriesPopular[position]
        holder.bind(tvseriesBanner)
    }
}