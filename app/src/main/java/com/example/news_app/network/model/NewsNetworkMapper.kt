package com.example.news_app.network.model

import com.example.news_app.domain.model.NewsArticle
import com.example.news_app.domain.util.EntityMapper

class NewsNetworkMapper : EntityMapper<NewsNetworkEntity, NewsArticle> {

    override fun mapFromEntity(entity: NewsNetworkEntity): NewsArticle {
        return NewsArticle(
            source = entity.source,
            author = entity.author,
            title = entity.title,
            description = entity.description,
            url = entity.url,
            urlToImage = entity.urlToImage,
            publishedAt = entity.publishedAt
        )
    }

    fun fromEntityList(initial: List<NewsNetworkEntity>): List<NewsArticle> {
        return initial.map { mapFromEntity(it) }
    }

}