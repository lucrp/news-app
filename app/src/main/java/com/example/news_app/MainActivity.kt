package com.example.news_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.news_app.domain.model.NewsArticle
import com.example.news_app.network.model.NewsNetworkEntity
import com.example.news_app.network.model.NewsNetworkMapper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val mapper = NewsNetworkMapper()

        val newsArticle = NewsArticle()

        val networkEntity: NewsNetworkEntity = mapper.mapToEntity(newsArticle)



    }
}