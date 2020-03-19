package com.tiaraarista.oopkotlin.Constructror

fun main(args: Array<String>){
    val person1 = Person("Tiara",20)

    println("Nama Depan = ${person1.namaDepan}")
    println("Usia = ${person1.usia}")
}
class Person(val namaDepan: String, var usia:Int){

}