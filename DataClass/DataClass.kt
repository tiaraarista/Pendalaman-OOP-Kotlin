package com.tiaraarista.oopkotlin.DataClass

data class User(val nama: String, val umur:Int)

fun main(args: Array<String>){
    val tiara = User("Tiara", 20)
    println("Nama = ${tiara.nama}")
    println("Nama = ${tiara.umur}")
}