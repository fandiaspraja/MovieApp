package com.fandiaspraja.movieapp.ui.detailmovie

import androidx.lifecycle.ViewModel
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.utils.DataMovie

class MovieDetailViewModel: ViewModel() {

    fun getDetailMovie(idMovie: String) : MovieEntity{

        val movies = DataMovie.generateMovies()

        lateinit var movieEntity: MovieEntity

        for (movie in movies){
            if (movie.id.equals(idMovie)){
                movieEntity = movie

                return movieEntity
            }
        }

        return movieEntity
    }
}