package com.fandiaspraja.movieapp.ui.tvseries

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fandiaspraja.movieapp.data.TvseriesEntity
import com.fandiaspraja.movieapp.utils.DataMovie

class TvSeriesViewModel : ViewModel() {

    fun getTvseries(): List<TvseriesEntity> = DataMovie.generateTvshow()
}