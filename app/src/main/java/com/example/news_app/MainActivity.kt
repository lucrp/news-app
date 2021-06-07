package com.example.news_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.news_app.domain.model.NewsArticle
import com.example.news_app.network.NewsRetrofitService
import com.example.news_app.network.model.NewsNetworkEntity
import com.example.news_app.network.model.NewsNetworkMapper
import com.google.gson.GsonBuilder
import kotlinx.coroutines.Dispatchers.IO
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val service = Retrofit.Builder()
            .baseUrl("https://newsapi.org")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(NewsRetrofitService::class.java)

        CouroutineScope(IO).Launch {

        }

    }
}