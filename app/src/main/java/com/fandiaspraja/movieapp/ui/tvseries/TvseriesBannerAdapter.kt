package com.fandiaspraja.movieapp.ui.tvseries

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fandiaspraja.movieapp.data.TvseriesEntity
import com.fandiaspraja.movieapp.databinding.ItemBannerBinding
import com.fandiaspraja.movieapp.ui.detailmovie.MovieDetailActivity
import com.fandiaspraja.movieapp.ui.detailtvseries.TvseriesDetailActivity

class TvseriesBannerAdapter: RecyclerView.Adapter<TvseriesBannerAdapter.TvseriesBannerViewHolder>() {

    private var listTvseriesBanner = ArrayList<TvseriesEntity>()

    fun setTvseriesBanner(tvseriesBanner: List<TvseriesEntity>?) {
        if (tvseriesBanner == null) return
        this.listTvseriesBanner.clear()
        this.listTvseriesBanner.addAll(tvseriesBanner)
    }

    class TvseriesBannerViewHolder(private val binding: ItemBannerBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(tvseriesEntity: TvseriesEntity){
            with(binding){

                    Glide
                            .with(root)
                            .load(tvseriesEntity.imgMovie)
                            .centerCrop()
                            .into(imgBanner)

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvseriesBannerViewHolder {
        val itemsMovieBannerBinding = ItemBannerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvseriesBannerViewHolder(itemsMovieBannerBinding)
    }

    override fun getItemCount(): Int = listTvseriesBanner.size

    override fun onBindViewHolder(holder: TvseriesBannerViewHolder, position: Int) {
        val tvseriesBanner = listTvseriesBanner[position]
        holder.bind(tvseriesBanner)
    }
}