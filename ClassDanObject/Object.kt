package com.tiaraarista.oopkotlin.ClassDanObject

class Lamp{
    // data member
    private var isOn: Boolean = false
    // member function
    fun turnOn(){
        isOn = true
    }
    // member function
    fun turnOff(){
        isOn = false
    }
}

fun main(args: Array<String>){
    val l1 = Lamp()//create l1 object Lampu class
    val l2 = Lamp()//create l2 object Lampu class
}