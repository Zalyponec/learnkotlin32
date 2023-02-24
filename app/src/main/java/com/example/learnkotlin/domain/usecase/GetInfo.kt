package com.example.learnkotlin.domain.usecase

import com.example.learnkotlin.domain.model.GetInfoModel

class GetInfo() {
    fun execute(): GetInfoModel {
        return GetInfoModel(engine = "V8", power = 760)
    }
}