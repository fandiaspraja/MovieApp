package com.fandiaspraja.movieapp.ui.tvseries

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fandiaspraja.movieapp.data.TvseriesEntity
import com.fandiaspraja.movieapp.databinding.ItemAllBinding
import com.fandiaspraja.movieapp.ui.detailtvseries.TvseriesDetailActivity

class TvseriesAllAdapter: RecyclerView.Adapter<TvseriesAllAdapter.TvseriesAllViewHolder>() {

    private var listTvseriesAll = ArrayList<TvseriesEntity>()

    fun setTvSeriesAll(tvseriesAll: List<TvseriesEntity>?) {
        if (tvseriesAll == null) return
        this.listTvseriesAll.clear()
        this.listTvseriesAll.addAll(tvseriesAll)
    }

    class TvseriesAllViewHolder(private val binding: ItemAllBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(tvseriesEntity: TvseriesEntity){
            with(binding){
                Glide
                        .with(root)
                        .load(tvseriesEntity.imgMovie)
                        .centerCrop()
                        .into(imgAll)

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvseriesAllViewHolder {
        val itemsTvseriesAllBinding = ItemAllBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvseriesAllViewHolder(itemsTvseriesAllBinding)
    }

    override fun getItemCount(): Int = listTvseriesAll.size

    override fun onBindViewHolder(holder: TvseriesAllViewHolder, position: Int) {
        val tvSeriesBanner = listTvseriesAll[position]
        holder.bind(tvSeriesBanner)
    }
}