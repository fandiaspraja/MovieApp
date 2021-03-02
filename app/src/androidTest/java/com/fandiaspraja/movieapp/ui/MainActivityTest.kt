package com.fandiaspraja.movieapp.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.fandiaspraja.movieapp.R
import com.fandiaspraja.movieapp.utils.DataMovie
import org.junit.Before
import org.junit.Test

class MainActivityTest{

    private val dataMovie = DataMovie.generateMovies()

    private val dataBanner = DataMovie.generateBanner()

    private val dataTvseries = DataMovie.generateTvshow()

    @Before
    fun setUp(){
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun pageNavigationTest(){
        onView(withId(R.id.navigation_home)).perform(click())
        onView(withId(R.id.navigation_home)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_All_banner)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataBanner.size))
        onView(withId(R.id.rv_movie_popular)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
        onView(withId(R.id.rv_popular_tvseries)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTvseries.size))

        onView(withId(R.id.navigation_movie)).perform(click())
        onView(withId(R.id.navigation_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie_banner)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
        onView(withId(R.id.rv_movies_popular)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
        onView(withId(R.id.rv_movie_all)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))

        onView(withId(R.id.navigation_series)).perform(click())
        onView(withId(R.id.navigation_series)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvseries_banner)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTvseries.size))
        onView(withId(R.id.rv_tvseries_popular)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTvseries.size))
        onView(withId(R.id.rv_tvseries_all)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTvseries.size))

    }

    @Test
    fun loadAllDataDetail(){
        onView(withId(R.id.navigation_home)).perform(click())
        onView(withId(R.id.navigation_home)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_All_banner)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
        onView(withId(R.id.rv_All_banner)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        pressBack()
        onView(withId(R.id.rv_movie_popular)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
        onView(withId(R.id.rv_movie_popular)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1, click()))
        pressBack()
        onView(withId(R.id.rv_popular_tvseries)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
        onView(withId(R.id.rv_popular_tvseries)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click()))
        pressBack()
    }

    @Test
    fun loadMovieDataDetail(){
        onView(withId(R.id.navigation_movie)).perform(click())
        onView(withId(R.id.navigation_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie_banner)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
        onView(withId(R.id.rv_movie_banner)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        pressBack()
        onView(withId(R.id.rv_movies_popular)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
        onView(withId(R.id.rv_movies_popular)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1, click()))
        pressBack()
        onView(withId(R.id.rv_movie_all)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
        onView(withId(R.id.rv_movie_all)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(10, click()))
        pressBack()
    }

    @Test
    fun loadTvseriesDataDetail(){
        onView(withId(R.id.navigation_series)).perform(click())
        onView(withId(R.id.navigation_series)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvseries_banner)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTvseries.size))
        onView(withId(R.id.rv_tvseries_banner)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        pressBack()
        onView(withId(R.id.rv_tvseries_popular)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTvseries.size))
        onView(withId(R.id.rv_tvseries_popular)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(5, click()))
        pressBack()
        onView(withId(R.id.rv_tvseries_all)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTvseries.size))
        onView(withId(R.id.rv_tvseries_all)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(3, click()))
    }
}