package com.tiaraarista.oopkotlin.DataClass

data class usrs(val nama:String, val umur:Int, val jk:String)

fun main(args: Array<String>){
    val u1 = usrs("Tiara",20,"Perempuan")

    val (nama, umur, jk) = u1
    println("Nama = $nama")
    println("Umur = $umur")
    println("Jenis Kelamin = $jk")
}