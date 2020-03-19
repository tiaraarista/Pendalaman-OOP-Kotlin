package com.tiaraarista.oopkotlin.Inheritance

fun main(args: Array<String>){
    val p1 = AuthLog("Password Buruk")
}

open class Log{
    var data: String = ""
    var nomorData = 0
    constructor(_data: String){
    }
    constructor(_data: String, _nomorData: Int){
        data = _data
        nomorData + _nomorData
        println("$data: $nomorData kali")
    }
}
class AuthLog: Log{
    constructor(_data:String): this("Dari Authlog -> + $_data", 10){
    }
    constructor(_data: String, _nomorData: Int): super(_data, _nomorData){
    }
}