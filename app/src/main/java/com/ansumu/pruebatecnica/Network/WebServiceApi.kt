package com.ansumu.pruebatecnica.Network

import com.ansumu.pruebatecnica.Model.ResponseUser
import retrofit2.Response
import retrofit2.http.GET

interface WebServiceApi {
    @GET("api/?results=50")
    suspend fun getListado(): Response<ResponseUser>
}
