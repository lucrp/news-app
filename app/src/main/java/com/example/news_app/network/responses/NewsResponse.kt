package com.example.news_app.network.responses

import com.example.news_app.network.model.NewsDto
import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("articles")
    val articles: List<NewsDto>,

    @SerializedName("status")
    val status: String,

    @SerializedName("totalResults")
    val totalResults: Int
)