package com.ansumu.pruebatecnica.Network

import com.ansumu.pruebatecnica.Model.ResponseUser
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WebServiceApi {
    @GET("api/")
    suspend fun getListado(@Query("results") results: Int): Response<ResponseUser>
}
