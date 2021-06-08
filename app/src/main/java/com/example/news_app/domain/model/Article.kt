package com.example.news_app.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Article(
    val author: String?,
    val content: String,
    val title: String,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: Date,
    val source: Source,
) : Parcelable