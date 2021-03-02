package com.fandiaspraja.movieapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.fandiaspraja.movieapp.R
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.data.TvseriesEntity
import com.fandiaspraja.movieapp.databinding.FragmentHomeBinding
import com.fandiaspraja.movieapp.ui.movie.MovieBannerAdapter
import com.fandiaspraja.movieapp.ui.movie.MoviePopularAdapter
import com.fandiaspraja.movieapp.ui.tvseries.TvseriesPopularAdapter

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    lateinit var movieBannerAdapter: MovieBannerAdapter
    lateinit var moviePopularAdapter: MoviePopularAdapter
    lateinit var tvseriesPopularAdapter: TvseriesPopularAdapter

    private lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        fragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater, container, false)


        val banners = homeViewModel.getBanner()

        movieBannerAdapter = MovieBannerAdapter()

        movieBannerAdapter.setMovieBanner(banners)

        with(fragmentHomeBinding.rvAllBanner){
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = movieBannerAdapter
        }

        val moviePopulars = homeViewModel.getMovies()
        moviePopularAdapter = MoviePopularAdapter()

        val listPopular = ArrayList<MovieEntity>()
        for (movie: MovieEntity in moviePopulars){
            if (movie.isFavorite){
                listPopular.add(movie)
            }
        }

        moviePopularAdapter.setMoviePopular(listPopular)

        with(fragmentHomeBinding.rvMoviePopular){
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = moviePopularAdapter
        }

        val tvseriesPopulars = homeViewModel.getTvseries()
        tvseriesPopularAdapter = TvseriesPopularAdapter()

        val listTvseriesPopular = ArrayList<TvseriesEntity>()
        for (tvseries: TvseriesEntity in tvseriesPopulars){
            if (tvseries.isFavorite){
                listTvseriesPopular.add(tvseries)
            }
        }

        tvseriesPopularAdapter.setTvseriesPopular(listTvseriesPopular)

        with(fragmentHomeBinding.rvPopularTvseries){
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = tvseriesPopularAdapter
        }

        return fragmentHomeBinding.root
    }
}