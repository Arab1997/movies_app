package com.daisybell.movies_app.data.uimodel

data class MovieListViewItem(
    val page: Int,
    val totalPage: Int,
    val movies: List<MovieViewItem>
) {
}