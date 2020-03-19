package com.tiaraarista.oopkotlin.GetterSetter

fun main(args: Array<String>){
    val p = Person()
    p.nama = "Tiara"
    println("${p.nama}")
}

class Person{
    var nama:String = "devaultValue"
    get()=field
    set(value){
        field =value
    }
}