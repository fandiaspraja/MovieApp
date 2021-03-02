package com.fandiaspraja.movieapp.ui.home

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class HomeViewModelTest {

    private lateinit var homeViewModel: HomeViewModel

    @Before
    fun setUp(){
        homeViewModel = HomeViewModel()
    }

    @Test
    fun getMovies() {
        val movieEntities = homeViewModel.getMovies()
        assertNotNull(movieEntities)
        assertEquals(19, movieEntities.size)
    }

    @Test
    fun getBanner() {
        val bannerEntities = homeViewModel.getBanner()
        assertNotNull(bannerEntities)
        assertEquals(4, bannerEntities.size)
    }

    @Test
    fun getTvseries() {
        val tvseriesEntities = homeViewModel.getTvseries()
        assertNotNull(tvseriesEntities)
        assertEquals(20, tvseriesEntities.size)
    }
}