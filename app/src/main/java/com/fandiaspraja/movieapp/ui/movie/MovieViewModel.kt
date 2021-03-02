package com.fandiaspraja.movieapp.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.utils.DataMovie

class MovieViewModel : ViewModel() {

    fun getBanner(): List<MovieEntity> = DataMovie.generateMovies()
}