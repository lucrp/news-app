package com.example.news_app.network.model

import com.example.news_app.domain.model.Source
import com.google.gson.annotations.SerializedName
import java.util.*

data class NewsDto(
    @SerializedName("source")
    var source : Source,

    @SerializedName("content")
    var content : String,

    @SerializedName("author")
    var author : String?,

    @SerializedName("title")
    var title : String,

    @SerializedName("description")
    var description : String?,

    @SerializedName("url")
    var url : String?,

    @SerializedName("urlToImage")
    var urlToImage : String?,

    @SerializedName("publishedAt")
    var publishedAt : Date,
    )