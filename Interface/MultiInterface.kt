package com.tiaraarista.oopkotlin.Interface

interface A{
    fun calMe(){
        println("dari Interface A")
    }
}
interface B{
    fun calMe(){
        println("dari Interface B")
    }
}
class C: A, B{
    override fun calMe() {
        super<A>.calMe()
        super<B>.calMe()
    }
}
fun main(args: Array<String>){
    val obj = C()
    obj.calMe()
}