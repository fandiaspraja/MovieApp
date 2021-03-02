package com.fandiaspraja.movieapp.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.fandiaspraja.movieapp.R
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.databinding.FragmentMovieBinding

class MovieFragment : Fragment() {

    private lateinit var movieViewModel: MovieViewModel

    lateinit var movieBannerAdapter: MovieBannerAdapter
    lateinit var popularAdapter: MoviePopularAdapter
    lateinit var movieAllAdapter: MovieAllAdapter

    private lateinit var fragmentMovieBinding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        movieViewModel =
            ViewModelProvider(this).get(MovieViewModel::class.java)

        fragmentMovieBinding = FragmentMovieBinding.inflate(layoutInflater, container, false)

        val banners = movieViewModel.getBanner()
        movieBannerAdapter = MovieBannerAdapter()

        val listBanner = ArrayList<MovieEntity>()
        for (movie: MovieEntity in banners){
            if (movie.isBanner){
                listBanner.add(movie)
            }
        }
        movieBannerAdapter.setMovieBanner(listBanner)

        with(fragmentMovieBinding.rvMovieBanner){
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = movieBannerAdapter
        }

        popularAdapter = MoviePopularAdapter()

        val listPopular = ArrayList<MovieEntity>()
        for (movie: MovieEntity in banners){
            if (movie.isFavorite){
                listPopular.add(movie)
            }
        }

        popularAdapter.setMoviePopular(listPopular)

        with(fragmentMovieBinding.rvMoviesPopular){
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = popularAdapter
        }

        movieAllAdapter = MovieAllAdapter()
        movieAllAdapter.setMovieAll(banners)
        with(fragmentMovieBinding.rvMovieAll){
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = movieAllAdapter
        }

        return fragmentMovieBinding.root
    }
}