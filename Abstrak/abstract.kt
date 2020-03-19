package com.tiaraarista.oopkotlin.Abstrak

abstract class  Personal(nama: String) {
    init {
        println("nama saya adalah $nama.")
    }
    fun tampilkanNIM(nim: Int){
        println("SSN saya adalah $nim.")
    }
    abstract fun tampilkan(keterangan: String)
}

class Pengajar(nama: String): Personal(nama){
    override fun tampilkan(keterangan: String){
        println(keterangan)
    }
}
fun main(args: Array<String>){
    val jek = Pengajar("Tiara Arista Hasanah")
    jek.tampilkan("Saya Seorang Mahasiswa")
    jek.tampilkanNIM(17090010)
}