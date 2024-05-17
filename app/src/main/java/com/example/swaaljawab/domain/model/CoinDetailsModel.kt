package com.example.swaaljawab.domain.model

import com.example.swaaljawab.data.remote.dto.Team

data class CoinDetailsModel(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<Team>
)
