package com.example.swaaljawab.data.remote.dto

import com.example.swaaljawab.domain.model.CoinModel

data class CoinDto(
    val id: String,
    val isActive: Boolean,
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDto.toCoinModel(): CoinModel{
    return CoinModel(
        id = id,
        isActive = isActive,
        name= name,
        rank = rank,
        symbol = symbol
    )
}