package com.example.horoscoapp.domian.model

import com.google.gson.annotations.SerializedName

data class PredictionModel(
    val horoscope: String,
    val sign: String
)