package com.daisybell.movies_app.base.di


import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class ApiInterceptor @Inject constructor() : Interceptor {
    // Fields from the variant
    val API_KEY = "b21a2c3d97f71ba3d2aab3d14098d2e8"
    val API_URL = "https://api.themoviedb.org/3/"

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val originalHttpUrl = original.url
        val requestBuilder = original.newBuilder().url(originalHttpUrl.newBuilder().addQueryParameter("api_key", API_KEY).build())
        return chain.proceed(requestBuilder.build())
    }
}