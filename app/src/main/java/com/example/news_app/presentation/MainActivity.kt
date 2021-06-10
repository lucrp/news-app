package com.example.news_app.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.news_app.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var someRandomString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


    }
}