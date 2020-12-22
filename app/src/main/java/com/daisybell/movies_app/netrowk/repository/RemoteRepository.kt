package com.daisybell.movies_app.netrowk.repository


import com.daisybell.movies_app.data.Movie
import com.daisybell.movies_app.data.CastResponse
import com.daisybell.movies_app.data.MovieDetailReponse
import com.daisybell.movies_app.domain.repository.IMovieRepository
import com.daisybell.movies_app.netrowk.service.RemoteApiService
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteRepository @Inject constructor(private val api: RemoteApiService) : IMovieRepository {
    override fun getPopularMovies(page: Int): Observable<Movie> = api.getPopularMovies(page)
    override fun getUpComingMovies(page: Int): Observable<Movie> = api.getUpComingMovies(page)
    override fun getNowPlayingMovies(page: Int): Observable<Movie> = api.getNowPlayingMovies(page)
    override fun getSimilarMovies(movieId: Int): Observable<Movie> = api.getSimilarMovies(movieId)
    override fun getRecommendationMovies(movieId: Int): Observable<Movie> = api.getRecommendationMovies(movieId)
    override fun getMovieCredits(movieId: Int): Observable<CastResponse> = api.getMovieCredits(movieId)
    override fun getMovieDetail(movieId: Int): Observable<MovieDetailReponse> = api.getMovieDetail(movieId)
    override fun searchMovie(query: String, page: Int): Observable<Movie> = api.searchMovie(query, page)
}