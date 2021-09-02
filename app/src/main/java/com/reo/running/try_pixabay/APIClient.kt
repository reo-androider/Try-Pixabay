package com.reo.running.try_pixabay

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

object APIClient {
    private val baseUrl: String = "https://pixabay.com"
    val retrofit: IApiType =
        Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
            .build().create(IApiType::class.java)
}

interface IApiType {
    @GET("/api")
    suspend fun fetchRepository(
        @Query("key") apiKey: String,
        @Query("orientation") orientation: String,
        @Query("category") category: String,
    ): Response<Pixabay>
}
