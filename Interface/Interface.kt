package com.tiaraarista.oopkotlin.Interface

interface MyInterface{
    val test : Int
    fun hai() : String
    fun hello(){
        println("Hello Semua!!")
    }
}

class InterfaceImp: MyInterface{
    override val test: Int =20
    override fun hai()="Hai Semua!!"
}

fun main(args: Array<String>){
    val obj = InterfaceImp()
    println("test=${obj.test}")
    println("panggil hallo:")

    obj.hello()

    println("Panggil dan Print hai: ")
    println(obj.hai())
}