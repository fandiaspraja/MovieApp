package com.fandiaspraja.movieapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.data.TvseriesEntity
import com.fandiaspraja.movieapp.utils.DataMovie

class HomeViewModel : ViewModel() {

//    private val _text = MutableLiveData<String>().apply {
//        value = "This is home Fragment"
//    }
//    val text: LiveData<String> = _text

    fun getMovies(): List<MovieEntity> = DataMovie.generateMovies()

    fun getBanner(): List<MovieEntity> = DataMovie.generateBanner()

    fun getTvseries(): List<TvseriesEntity> = DataMovie.generateTvshow()
}