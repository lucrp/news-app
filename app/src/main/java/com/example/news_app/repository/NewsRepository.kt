package com.example.news_app.repository

import com.example.news_app.domain.model.Article

interface NewsRepository {

    suspend fun topNewsHeadlines(): List<Article>

}