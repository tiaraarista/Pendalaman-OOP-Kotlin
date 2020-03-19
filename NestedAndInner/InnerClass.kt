package com.tiaraarista.oopkotlin.NestedAndInner

class Outerr {
    val a = "Di Luar Nested Class."

    inner class Inner {
        fun callMe() = a
    }
}

fun main(args: Array<String>) {
    val outer = Outerr()
    println("menggunakan objek outer: ${outer.Inner().callMe()}")

    val inner = Outerr().Inner()
    println("menggunakan objek inner: ${inner.callMe()}")
}