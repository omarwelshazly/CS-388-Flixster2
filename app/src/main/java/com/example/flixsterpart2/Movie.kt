package com.example.flixsterpart2

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Keep
@Serializable
data class BaseResponse(
    @SerialName("results")
    val result: List<Movie>?
)

@Keep
@Serializable
data class Movie(
    @SerialName("title")
    val title: String?,
    @SerialName("vote_average")
    val vote: Double?,

    @SerialName("poster_path")
    val poster_path: String?,
    @SerialName("release_date")
    val release_date: String?,
    @SerialName("overview")
    val overview: String?

) : java.io.Serializable
