package com.example.learnkotlin.domain.usecase

import com.example.learnkotlin.domain.model.GetInfoModel

class GetInfo(val engine : String,  val power: Int) {

    fun execute (): GetInfoModel {
        return GetInfoModel(engine = this.engine, power = this.power)
    }


}