package com.fandiaspraja.movieapp.ui.movie

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieViewModelTest {

    private lateinit var movieViewModel: MovieViewModel

    @Before
    fun setUp(){
        movieViewModel = MovieViewModel()
    }

    @Test
    fun getBanner() {
        val movieEntities = movieViewModel.getBanner()
        assertNotNull(movieEntities)
        assertEquals(19, movieEntities.size)
    }
}