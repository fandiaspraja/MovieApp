package com.fandiaspraja.movieapp.utils

import com.fandiaspraja.movieapp.R
import com.fandiaspraja.movieapp.data.MovieEntity
import com.fandiaspraja.movieapp.data.TvseriesEntity

object DataMovie {

    fun generateMovies(): List<MovieEntity>{

        val movies = ArrayList<MovieEntity>()

        movies.add(MovieEntity("1", R.mipmap.poster_a_start_is_born, "A Star Is Born", "05/10/2018",
        "Drama, Percintaan, Musik", "2h 16m", "75%", "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
        "Bradley Cooper", "Eric Roth", "Bradley Cooper, Lady Gaga", true))
        movies.add(MovieEntity("2", R.mipmap.poster_alita, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", false, true))
        movies.add(MovieEntity("3", R.mipmap.poster_aquaman, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz"))
        movies.add(MovieEntity("4", R.mipmap.poster_bohemian, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", true))
        movies.add(MovieEntity("5", R.mipmap.poster_cold_persuit, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz"))
        movies.add(MovieEntity("6", R.mipmap.poster_creed, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", true))
        movies.add(MovieEntity("7", R.mipmap.poster_crimes, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz"))
        movies.add(MovieEntity("8", R.mipmap.poster_glass, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz"))
        movies.add(MovieEntity("9", R.mipmap.poster_how_to_train, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz"))
        movies.add(MovieEntity("10", R.mipmap.poster_infinity_war, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz"))
        movies.add(MovieEntity("11", R.mipmap.poster_marry_queen, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", true))
        movies.add(MovieEntity("12", R.mipmap.poster_master_z, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", false, true))
        movies.add(MovieEntity("13", R.mipmap.poster_mortal_engines, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz"))
        movies.add(MovieEntity("14", R.mipmap.poster_overlord, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", true))
        movies.add(MovieEntity("15", R.mipmap.poster_ralph, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz"))
        movies.add(MovieEntity("16", R.mipmap.poster_robin_hood, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz"))
        movies.add(MovieEntity("17", R.mipmap.poster_serenity, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", false, true))
        movies.add(MovieEntity("18", R.mipmap.poster_spiderman, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", true))
        movies.add(MovieEntity("19", R.mipmap.poster_t34, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz"))

        return movies
    }

    fun generateTvshow(): List<TvseriesEntity>{

        val tvshow = ArrayList<TvseriesEntity>()

        tvshow.add(
            TvseriesEntity("1", R.mipmap.poster_the_simpson, "The Simpson", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("2", R.mipmap.poster_arrow, "Arrow", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", false, true))
        tvshow.add(TvseriesEntity("3", R.mipmap.poster_ncis, "NCIS", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("4", R.mipmap.poster_the_walking_dead, "The Walking Dead", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", false, true))
        tvshow.add(TvseriesEntity("5", R.mipmap.poster_naruto_shipudden, "Naruto Shipudden", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("6", R.mipmap.poster_doom_patrol, "Doom Patrol", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("7", R.mipmap.poster_flash, "Flash", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("8", R.mipmap.poster_gotham, "Gotham", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", false, true))
        tvshow.add(TvseriesEntity("9", R.mipmap.poster_god, "God", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("10", R.mipmap.poster_hanna, "Hanna", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("11", R.mipmap.poster_grey_anatomy, "Grey Anatomy", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", false, true))
        tvshow.add(TvseriesEntity("12", R.mipmap.poster_family_guy, "Family Guy", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("13", R.mipmap.poster_dragon_ball, "Dragon Ball", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("14", R.mipmap.poster_riverdale, "Riverdale", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("15", R.mipmap.poster_supergirl, "Supergirl", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("16", R.mipmap.poster_fairytail, "Fairytail", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("17", R.mipmap.poster_the_umbrella, "The Umbrella", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("18", R.mipmap.poster_supernatural, "Supernatural", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("19", R.mipmap.poster_iron_fist, "Iron Fist", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))
        tvshow.add(TvseriesEntity("20", R.mipmap.poster_shameless, "Shameless", "14/02/2019",
            "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Robert Rodriguez", "Laeta Kalogridis", true))


        return tvshow
    }

    fun generateBanner(): List<MovieEntity>{

        val movies = ArrayList<MovieEntity>()

        movies.add(MovieEntity("1", R.mipmap.poster_a_start_is_born, "A Star Is Born", "05/10/2018",
                "Drama, Percintaan, Musik", "2h 16m", "75%", "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
                "Bradley Cooper", "Eric Roth", "Bradley Cooper, Lady Gaga", true, true))
        movies.add(MovieEntity("2", R.mipmap.poster_alita, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", false, true))
        movies.add(MovieEntity("3", R.mipmap.poster_iron_fist, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", false, true))
        movies.add(MovieEntity("4", R.mipmap.poster_shameless, "Alita: Battle Angel", "14/02/2019",
                "Aksi, Cerita Fiksi, Petualangan", "2h 2m", "71%", "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "Robert Rodriguez", "Laeta Kalogridis", "Rosa Salazar, Christoph Waltz", true, true))

        return movies
    }

}