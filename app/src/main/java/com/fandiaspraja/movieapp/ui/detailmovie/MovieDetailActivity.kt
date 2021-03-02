package com.fandiaspraja.movieapp.ui.detailmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.fandiaspraja.movieapp.R
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.databinding.ActivityMovieDetailBinding

class MovieDetailActivity : AppCompatActivity() {

    private lateinit var movieDetailBinding: ActivityMovieDetailBinding

    private lateinit var movieDetailViewModel: MovieDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        movieDetailViewModel = ViewModelProvider(this).get(MovieDetailViewModel::class.java)

        movieDetailBinding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(movieDetailBinding.root)


        if (intent.getStringExtra("idMovie") != null){

            var idMovie = intent.getStringExtra("idMovie")

            var movie = movieDetailViewModel.getDetailMovie(idMovie.toString()) as? MovieEntity

            Log.d("idmovie", idMovie.toString())
            Glide
                .with(this)
                .load(movie?.imgMovie)
                .centerCrop()
                .into(movieDetailBinding.imgMovie)

            movieDetailBinding.run {
                tittleMovie.text = movie?.title
                rating.text = movie?.rating
                genre.text = movie?.genre
                duration.text = movie?.duration
                date.text = movie?.date
                description.text = movie?.description
                director.text = movie?.director
                screenplay.text = movie?.screenplay
                actor.text = movie?.actor
            }
        }
    }
}