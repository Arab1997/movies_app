package com.daisybell.movies_app.data

import com.google.gson.annotations.SerializedName

data class SpokenLanguage(
    @SerializedName("name") val name: String?,
    @SerializedName("iso_639_1") val iso: String?
)