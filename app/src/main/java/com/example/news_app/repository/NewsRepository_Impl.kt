package com.example.news_app.repository

import com.example.news_app.domain.model.Article
import com.example.news_app.network.NewsRetrofitService
import com.example.news_app.network.model.NewsDtoMapper

class NewsRepository_Impl(
    private val newsRetrofitService: NewsRetrofitService,
    private val mapper: NewsDtoMapper
): NewsRepository {
    override suspend fun topNewsHeadlines(): List<Article> {
       return mapper.toDomainList( newsRetrofitService.getTopHeadlines(country = "fr", category = "all", pageSize = 20, page = 1 ).articles)
    }
}