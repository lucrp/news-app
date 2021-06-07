package com.example.news_app.network.responses

import com.example.news_app.network.model.NewsNetworkEntity
import com.google.gson.annotations.SerializedName

class HeadlinesResponse (
    @SerializedName("status")
    var status: String,

    @SerializedName("articles")
    var articles: List<NewsNetworkEntity>
)