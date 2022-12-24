package com.example.cryptocee.feature_crypto_main.domain.model


import com.google.gson.annotations.SerializedName

data class LinksExtended(
    @SerializedName("stats")
    val stats: Stats,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)