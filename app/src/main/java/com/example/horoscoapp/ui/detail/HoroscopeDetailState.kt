package com.example.horoscoapp.ui.detail

import com.example.horoscoapp.domian.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading : HoroscopeDetailState()
    data class Error(val error: String) : HoroscopeDetailState()
    data class Success(val data: String, val sign: String, val horoscopeModel: HoroscopeModel) : HoroscopeDetailState()

}