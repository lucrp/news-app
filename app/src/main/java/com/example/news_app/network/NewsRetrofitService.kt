package com.example.news_app.network

import com.example.news_app.network.responses.HeadlinesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsRetrofitService {
    @GET("/v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String?,
        @Query("category") category: String?,
        @Query("pageSize") pageSize: Int,
        @Query("page") page: Int
    ): HeadlinesResponse
}