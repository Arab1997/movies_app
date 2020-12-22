package com.daisybell.movies_app.utils

import com.daisybell.movies_app.data.Movie

interface OnGetMoviesCallback {
    fun onSuccess(movies: List<Movie?>?)
    fun onError()
}