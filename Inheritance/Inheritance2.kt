package com.tiaraarista.oopkotlin.Inheritance

open class Person(umur: Int, nama: String){
    //Kode
}

class Mhs(umur: Int,nama: String, kampus: String): Personal(umur, nama){
    init {
        println("Mahasiswa bernama $nama dengan umur $umur tahun kuliah di $kampus.")
    }
    fun kuliah(){
        println("Saya masih kuliah")
    }
}

fun main(args: Array<String>){
    val m1 = Mhs(20, "Tiara","Poltek Tegal")
}