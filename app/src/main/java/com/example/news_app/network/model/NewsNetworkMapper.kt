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

    override fun mapToEntity(domainModel: NewsArticle): NewsNetworkEntity {
        return NewsNetworkEntity(
            source = domainModel.source,
            author = domainModel.author,
            title = domainModel.title,
            description = domainModel.description,
            url = domainModel.url,
            urlToImage = domainModel.urlToImage,
            publishedAt = domainModel.publishedAt
        )
    }

    fun fromEntityList(initial: List<NewsNetworkEntity>): List<NewsArticle> {
        return initial.map { mapFromEntity(it)}
    }

    fun toEntityList(initial: List<NewsArticle>): List<NewsNetworkEntity> {
        return initial.map { mapToEntity(it) }
    }

}