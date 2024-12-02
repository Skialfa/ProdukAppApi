package com.mobiledimas.produkappapi.service

import com.mobiledimas.produkappapi.model.ResponseProduk
import retrofit2.Call
import retrofit2.http.GET

interface ProdukService {
    @GET("products") //end point
    fun getAllProduk() : Call<ResponseProduk>
}