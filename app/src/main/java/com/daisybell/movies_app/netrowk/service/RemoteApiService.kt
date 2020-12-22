package com.daisybell.movies_app.netrowk.service

import com.daisybell.movies_app.data.Movie
import com.daisybell.movies_app.data.CastResponse
import com.daisybell.movies_app.data.MovieDetailReponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RemoteApiService {

    @GET("movie/popular")
    fun getPopularMovies(@Query("page") page: Int): Observable<Movie>

    @GET("movie/upcoming")
    fun getUpComingMovies(@Query("page") page: Int): Observable<Movie>

    @GET("movie/now_playing")
    fun getNowPlayingMovies(@Query("page") page: Int): Observable<Movie>

    @GET("movie/{movie_id}")
    fun getMovieDetail(@Path("movie_id") movieId: Int): Observable<MovieDetailReponse>

    @GET("movie/{movie_id}/similar")
    fun getSimilarMovies(@Path("movie_id") movieId: Int): Observable<Movie>

    @GET("movie/{movie_id}/credits")
    fun getMovieCredits(@Path("movie_id") movieId: Int): Observable<CastResponse>

    @GET("movie/{movie_id}/recommendations")
    fun getRecommendationMovies(@Path("movie_id") movieId: Int): Observable<Movie>

    @GET("search/movie")
    fun searchMovie(@Query("query") query: String, @Query("page") page: Int): Observable<Movie>

}