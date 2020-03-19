package com.tiaraarista.oopkotlin.ClassDanObject

class Lampu{
    //data member
    private var isOn: Boolean = false
    //member function
    fun turnOn(){
        isOn = true
    }
    //member function
    fun turnOff(){
        isOn = false
    }
    fun displayLightStatus(lampu:String){
        if (isOn == true)
            println("$lampu Lampu is On")
        else
            println("$lampu Lampu is Off")
    }
}

fun main(args: Array<String>){
    val a = Lampu()    //Create 11 object Lampu Class
    val b = Lampu()    //Create 12 object Lampu Class
    a.turnOn()
    b.turnOff()
    a.displayLightStatus("a")
    b.displayLightStatus("b")
}