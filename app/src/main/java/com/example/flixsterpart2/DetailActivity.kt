package com.example.flixsterpart2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var rateTextView: TextView
    private lateinit var releaseDateTextView: TextView
    private lateinit var overviewTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_details)

        mediaImageView = findViewById(R.id.mediaImage)
        titleTextView = findViewById(R.id.mediaTitle)
        rateTextView = findViewById(R.id.mediaRate)
        releaseDateTextView = findViewById(R.id.mediaReleaseDate)
        overviewTextView = findViewById(R.id.mediaOverview)

        val movie = intent.getSerializableExtra(MOVIE_EXTRA) as Movie

        titleTextView.text = movie.title.toString()
        rateTextView.text = "Rate : " + movie.vote.toString()
        releaseDateTextView.text = "Release Date: " + movie.release_date
        overviewTextView.text = "Overview: " + movie.overview

        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500" + movie.poster_path)
            .into(mediaImageView)


    }
}