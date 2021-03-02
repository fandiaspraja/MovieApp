package com.fandiaspraja.movieapp.ui.detailtvseries

import androidx.lifecycle.ViewModel
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.data.TvseriesEntity
import com.fandiaspraja.movieapp.utils.DataMovie

class TvseriesDetailViewModel: ViewModel() {

    fun getDetailTvseries(idTvseries: String) : TvseriesEntity {

        val tvseries = DataMovie.generateTvshow()

        lateinit var tvseriesEntity: TvseriesEntity

        for (series in tvseries){
            if (series.id.equals(idTvseries)){
                tvseriesEntity = series

                return tvseriesEntity
            }
        }

        return tvseriesEntity
    }
}