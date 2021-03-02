package com.fandiaspraja.movieapp.ui.tvseries

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvSeriesViewModelTest {

    private lateinit var tvSeriesViewModel: TvSeriesViewModel

    @Before
    fun setUp(){
        tvSeriesViewModel = TvSeriesViewModel()
    }

    @Test
    fun getTvseries() {
        val tvseriesEntities = tvSeriesViewModel.getTvseries()
        assertNotNull(tvseriesEntities)
        assertEquals(20, tvseriesEntities.size)
    }
}