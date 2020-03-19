package com.tiaraarista.oopkotlin.Inheritance

open class Personal(umur: Int, nama: String){
    init {
        println("Nama Saya adalah $nama.")
        println("Umur Saya adalah $umur.")
    }
}
class GuruMatematika(umur: Int, nama: String): Personal(umur, nama){
    fun mengajar(){
        println("Saya mengajar di kelas SD.")
    }
}
class Mahasiswa(umur: Int, nama: String): Personal(umur, nama){
    fun kuliah(){
        println("Saya Mahasiswa Poltek Tegal.")
    }
}

fun main(args: Array<String>){
    val  t1 = GuruMatematika(25,"Ridha")
    t1.mengajar()
    println()
    val m1 = Mahasiswa(20,"Tiara")
    m1.kuliah()
}