package com.example.learnkotlin.domain.usecase

import com.example.learnkotlin.domain.model.SetInfoModel

public class SetInfo() {
fun execute (param: SetInfoModel): Boolean {
    if(param.name.isEmpty()) return false else return true
}

}
