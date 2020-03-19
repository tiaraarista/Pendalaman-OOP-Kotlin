package com.tiaraarista.oopkotlin.DataClass

data class userr(val nama: String, val umur:Int)

fun main(args: Array<String>){
    val u1 = userr("Tiara",20)
    println(u1.toString())
}