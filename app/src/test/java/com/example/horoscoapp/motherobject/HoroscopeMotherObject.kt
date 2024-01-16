package com.example.horoscoapp.motherobject

import com.example.horoscoapp.data.network.response.PredictionResponse
import com.example.horoscoapp.domian.model.HoroscopeInfo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
        HoroscopeInfo.Aries,
        HoroscopeInfo.Taurus,
        HoroscopeInfo.Gemini,
        HoroscopeInfo.Cancer,
        HoroscopeInfo.Leo,
        HoroscopeInfo.Libra,
        HoroscopeInfo.Sagittarius,
        HoroscopeInfo.Scorpio,
        HoroscopeInfo.Virgo,
        HoroscopeInfo.Capricorn,
        HoroscopeInfo.Aquarius,
        HoroscopeInfo.Pisces
    )

}