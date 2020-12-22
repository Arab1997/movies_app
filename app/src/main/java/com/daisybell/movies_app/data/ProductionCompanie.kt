package com.daisybell.movies_app.data

import com.google.gson.annotations.SerializedName

data class ProductionCompanie(
    @SerializedName("logo_path") val logoPath: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("id") val id: Int?,
    @SerializedName("origin_country") val originCountry: String?
)