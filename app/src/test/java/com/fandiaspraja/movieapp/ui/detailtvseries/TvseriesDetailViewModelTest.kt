package com.fandiaspraja.movieapp.ui.detailtvseries

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvseriesDetailViewModelTest {

    private lateinit var tvseriesDetailViewModel: TvseriesDetailViewModel
    private lateinit var idTvseries: String

    @Before
    fun setUp(){
        idTvseries = "5"
        tvseriesDetailViewModel = TvseriesDetailViewModel()
    }

    @Test
    fun getDetailTvseries() {
        val tvseriesEntities = tvseriesDetailViewModel.getDetailTvseries(idTvseries)
        assertNotNull(tvseriesEntities)
        assertEquals("Naruto Shipudden", tvseriesEntities.title)
    }
}