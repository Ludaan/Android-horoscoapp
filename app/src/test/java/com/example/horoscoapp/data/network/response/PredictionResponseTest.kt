package com.example.horoscoapp.data.network.response

import com.example.horoscoapp.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Test

class PredictionResponseTest {


    @Test
    fun `toDomain should return a correct PredictionModel`() {
        //Given
        val horoscopeResponse = HoroscopeMotherObject.anyResponse

        //when
        val predictionModel = horoscopeResponse.toDomain()

        //then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope


    }
}