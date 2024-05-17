package com.example.swaaljawab.data.remote
import com.example.swaaljawab.data.remote.dto.CoinDetailsDto
import com.example.swaaljawab.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaAPI {

    @GET("/v1/coins")
    suspend fun getCoins() : List<CoinDto>

    @GET("v1/coins/{coinName}")
    suspend fun getCoinDetail(@Path("coinName") coinName : String) : CoinDetailsDto
}