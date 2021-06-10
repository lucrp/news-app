package com.example.news_app.presentation.ui.news_article_list

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsListViewModel
@Inject
constructor(
    private val randomString: String
) : ViewModel(){

    init {
        println("VIEWMODEL: ${randomString}")
    }

}