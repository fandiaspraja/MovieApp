package com.fandiaspraja.movieapp.ui.detailtvseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.data.TvseriesEntity
import com.fandiaspraja.movieapp.databinding.ActivityTvseriesDetailBinding

class TvseriesDetailActivity : AppCompatActivity() {

    private lateinit var tvseriesDetailBinding: ActivityTvseriesDetailBinding

    private lateinit var detailViewModel: TvseriesDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        detailViewModel = ViewModelProvider(this).get(TvseriesDetailViewModel::class.java)

        tvseriesDetailBinding = ActivityTvseriesDetailBinding.inflate(layoutInflater)
        setContentView(tvseriesDetailBinding.root)

        if (intent.getStringExtra("idTvseries") != null){

            var idTvseries = intent.getStringExtra("idTvseries")

            var tvseries = detailViewModel.getDetailTvseries(idTvseries.toString()) as? TvseriesEntity

            Glide
                .with(this)
                .load(tvseries?.imgMovie)
                .centerCrop()
                .into(tvseriesDetailBinding.imgTvseries)

            tvseriesDetailBinding.run {
                tittleTvseries.text = tvseries?.title
                rating.text = tvseries?.rating
                genre.text = tvseries?.genre
                duration.text = tvseries?.duration
                date.text = tvseries?.date
                description.text = tvseries?.description
                director.text = tvseries?.creator
                cast.text = tvseries?.cast
            }
        }
    }
}