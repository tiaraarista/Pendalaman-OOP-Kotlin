package com.tiaraarista.oopkotlin.ObjectSingleton

open class Person(){
    fun makan()= println("Makan Mi")
    fun ngomong()= println("bareng-bareng")
    open fun doa()= println("Bismillah")
}

fun main(args: Array<String>){
    val muslim = object: Person(){
        override fun doa()= println("jangan lupa baca doa")
    }
    muslim.makan()
    muslim.ngomong()
    muslim.doa()
}