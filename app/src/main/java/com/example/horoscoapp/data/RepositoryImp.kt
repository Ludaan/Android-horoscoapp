package com.example.horoscoapp.data

import android.util.Log
import com.example.horoscoapp.data.network.HoroscopeApiService
import com.example.horoscoapp.data.network.response.PredictionResponse
import com.example.horoscoapp.domian.Repository
import com.example.horoscoapp.domian.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImp @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain()}
            .onFailure { Log.i("xdanla", "Ha ocurrido un error ${it.message}") }

        return null
    }
}