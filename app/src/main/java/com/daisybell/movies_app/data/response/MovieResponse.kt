package com.daisybell.movies_app.data.response


import com.daisybell.movies_app.data.Movie
import com.google.gson.annotations.SerializedName

class MovieResponse(
    @SerializedName("page") val page: Int?,
    @SerializedName("total_pages") val totalPages: Int?,
    @SerializedName("results") val results: ArrayList<Movie>?
)