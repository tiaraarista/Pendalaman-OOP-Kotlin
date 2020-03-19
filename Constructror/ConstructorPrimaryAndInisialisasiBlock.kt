package com.tiaraarista.oopkotlin.Constructror

fun main(args: Array<String>){
    val person1 = Persn("Tiara", 20)
}
// salah satu contoh constraktor secondary
class Persn(nama: String, umurPerson: Int){
    val namaDepan: String
    var umur : Int

    //Initialisasi Block
    init {
        namaDepan = nama.capitalize()
        umur = umurPerson

        println("Nama Depan = $namaDepan")
        println("Umur = $umur")
    }
}