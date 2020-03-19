package com.tiaraarista.oopkotlin.DataClass

data class Users(val nama:String, val numur:Int)

fun main(args: Array<String>){
    val u1 = Users("Tiara",20)

    //Menggunakan func copy untuk membuat objek
    val  u2 = u1.copy(nama = "Ara")
    println("u1: Nama = ${u1.nama}, Umur = ${u1.numur}")
    println("u1: Nama = ${u2.nama}, Umur = ${u2.numur}")
}