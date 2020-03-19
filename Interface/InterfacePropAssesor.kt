package com.tiaraarista.oopkotlin.Interface

interface InterfaceKu{
    // Properti dengan Implementasi
    val  prop: Int
        get() = 20
}

class ImplementasiInterface : InterfaceKu{
    // Class Body
}

fun main(args: Array<String>){
    val obj = ImplementasiInterface()
    println(obj.prop)
}