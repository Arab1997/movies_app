package com.daisybell.movies_app.data.uimodel


import com.daisybell.movies_app.data.Genre

data class MovieDetailViewItem(
    val id: Int,
    val backdropPath: String,
    val genres: List<Genre>,
    val title: String,
    val overview: String,
    val popularity: Double,
    val imagePath: String,
    val releaseDate: String,
    val runtime: String,
    val status: String,
    val voteAverage: Float
) {
    fun getTextBottomOfTitle() = "$releaseDate • $runtime"
}