package com.example.horoscoapp.domian

import com.example.horoscoapp.domian.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String) : PredictionModel?
}