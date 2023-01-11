package com.plcoding.cryptocurrencyappyt.domain.use_cases

import com.plcoding.cryptocurrencyappyt.domain.repository.CoinRepository
import javax.inject.Inject

class getCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
){

}