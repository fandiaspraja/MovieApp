package com.fandiaspraja.movieapp.data

import java.io.Serializable

data class MovieEntity(
        var id: String,
        var imgMovie: Int,
        var title: String,
        var date: String,
        var genre: String,
        var duration: String,
        var rating: String,
        var description: String,
        var director: String,
        var screenplay: String,
        var actor: String,
        var isFavorite: Boolean = false,
        var isBanner: Boolean = false
): Serializable