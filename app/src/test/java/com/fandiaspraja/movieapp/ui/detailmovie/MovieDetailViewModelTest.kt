package com.fandiaspraja.movieapp.ui.detailmovie

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieDetailViewModelTest {

    private lateinit var movieDetailViewModel: MovieDetailViewModel

    private lateinit var idMovie: String

    @Before
    fun setUp(){
        idMovie = "3"
        movieDetailViewModel = MovieDetailViewModel()
    }

    @Test
    fun getDetailMovie() {
        val movieEntities = movieDetailViewModel.getDetailMovie(idMovie)
        assertNotNull(movieEntities)
        assertEquals("Alita: Battle Angel", movieEntities.title)
    }
}