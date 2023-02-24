package com.example.learnkotlin.domain.usecase

import com.example.learnkotlin.domain.model.SetInfoModel

class SetInfo {
fun saveinfo(param: SetInfoModel): Boolean {
    if(param.name.isEmpty()) return false else return true
}
}
