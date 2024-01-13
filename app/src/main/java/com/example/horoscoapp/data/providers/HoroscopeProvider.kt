package com.example.horoscoapp.data.providers

import com.example.horoscoapp.domian.model.HoroscopeInfo
import com.example.horoscoapp.domian.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Libra,
            Sagittarius,
            Scorpio,
            Virgo,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}