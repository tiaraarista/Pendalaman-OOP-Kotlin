package com.tiaraarista.oopkotlin.DataClass

data class Usr(val nama:String, val umur:Int)
fun main(args: Array<String>){
    val u1 = Usr("Tiara",20)
    val u2 = u1.copy()
    val u3 = u1.copy(nama = "Ara")

    println("u1 hashCode =${u1.hashCode()}")
    println("u2 hashCode =${u2.hashCode()}")
    println("u3 hashCode =${u3.hashCode()}")

    if (u1.equals(u2) == true)
        println("u1 sama dengan u2.")
    else
        println("u1 tidak sama dengan u2.")

    if (u1.equals((u3)) == true)
        println("u1 sama dengan u3.")
    else
        println("u1 tidak sama dengan u3.")
}