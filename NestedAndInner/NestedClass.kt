package com.tiaraarista.oopkotlin.NestedAndInner

class Outer{
    val a = "Di Luar Nested Class."
    class Nested{
        val b = "Di dalam Nested Class."
        fun callMe() = "Function akan dipanggil di dalam Nested Class."
    }
}

fun main(args: Array<String>){
    //Pengaksesan anggota dari Nested Class
    println(Outer.Nested().b)

    //Pembuatan Object dari Nested Class
    val nested = Outer.Nested()
    println(nested.callMe())
}