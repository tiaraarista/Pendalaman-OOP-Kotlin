package com.tiaraarista.oopkotlin.DataClass

data class usrr(val nama:String, val umur:Int, val jk:String)

fun main(args: Array<String>){
    val u1 = usrr("Tiara",20,"Perempuan")

    println(u1.component1())    //Tiara
    println(u1.component2())    //20
    println(u1.component3())    //Perempuan
}