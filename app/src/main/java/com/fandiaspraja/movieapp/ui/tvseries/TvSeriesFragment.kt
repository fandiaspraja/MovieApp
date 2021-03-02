package com.fandiaspraja.movieapp.ui.tvseries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.fandiaspraja.movieapp.databinding.FragmentTvseriesBinding

class TvSeriesFragment : Fragment() {

    private lateinit var tvSeriesViewModel: TvSeriesViewModel

    lateinit var tvseriesBannerAdapter: TvseriesBannerAdapter
    lateinit var popularAdapter: TvseriesPopularAdapter
    lateinit var tvseriesAllAdapter: TvseriesAllAdapter

    private lateinit var fragmentTvseriesBinding: FragmentTvseriesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tvSeriesViewModel =
            ViewModelProvider(this).get(TvSeriesViewModel::class.java)

        fragmentTvseriesBinding = FragmentTvseriesBinding.inflate(layoutInflater, container, false)

        val tvseries = tvSeriesViewModel.getTvseries()

        tvseriesBannerAdapter = TvseriesBannerAdapter()
        tvseriesBannerAdapter.setTvseriesBanner(tvseries)

        with(fragmentTvseriesBinding.rvTvseriesBanner){
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = tvseriesBannerAdapter
        }

        popularAdapter = TvseriesPopularAdapter()
        popularAdapter.setTvseriesPopular(tvseries)

        with(fragmentTvseriesBinding.rvTvseriesPopular){
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = popularAdapter
        }

        tvseriesAllAdapter = TvseriesAllAdapter()
        tvseriesAllAdapter.setTvSeriesAll(tvseries)
        with(fragmentTvseriesBinding.rvTvseriesAll){
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = tvseriesAllAdapter
        }

        return fragmentTvseriesBinding.root
    }
}