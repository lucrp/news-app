package com.example.news_app.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// id can be null
@Parcelize
data class Source(
    val id: String? = null,
    val name: String?
) : Parcelable
