package com.example.news_app.network

import retrofit2.http.GET

interface NewsRetrofitService {
    @GET("search")
    suspend fun search(
        @
    )
}