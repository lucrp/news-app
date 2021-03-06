package com.example.news_app.network.model

import com.example.news_app.domain.model.Article
import com.example.news_app.domain.util.DomainMapper

class NewsDtoMapper : DomainMapper<NewsDto, Article> {

    override fun mapToDomainModel(model: NewsDto): Article {
        return Article(
            source = model.source,
            content = model.content,
            author = model.author,
            title = model.title,
            description = model.description,
            url = model.url,
            urlToImage = model.urlToImage,
            publishedAt = model.publishedAt
        )
    }

    override fun mapFromDomainModel(domainModel: Article): NewsDto {
        return NewsDto(
            source = domainModel.source,
            content = domainModel.content,
            author = domainModel.author,
            title = domainModel.title,
            description = domainModel.description,
            url = domainModel.url,
            urlToImage = domainModel.urlToImage,
            publishedAt = domainModel.publishedAt
        )
    }

    fun toDomainList(initial: List<NewsDto>): List<Article> {
        return initial.map { mapToDomainModel(it)}
    }

/*    fun fromDomainList(initial: List<Article>): List<NewsDto> {
        return initial.map { mapFromDomainModel(it) }
    }*/

}