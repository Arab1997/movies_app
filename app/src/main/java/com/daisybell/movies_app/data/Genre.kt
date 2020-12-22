package com.daisybell.movies_app.data

import com.google.gson.annotations.SerializedName

data class Genre(
    @SerializedName("name") val name: String?,
    @SerializedName("id") val id: Int?
)