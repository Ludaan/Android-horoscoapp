package com.example.horoscoapp.domian.usecase

import com.example.horoscoapp.domian.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)

}