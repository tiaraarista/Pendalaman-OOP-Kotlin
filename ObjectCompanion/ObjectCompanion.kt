package com.tiaraarista.oopkotlin.ObjectCompanion

class Person{
    companion object{
        fun callMe() = println("Panggil saya Tiara")
    }
}
fun main(args: Array<String>){
    Person.callMe()
}