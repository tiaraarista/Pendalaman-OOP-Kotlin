package com.tiaraarista.oopkotlin.SealedClass

sealed class Expr
class Const(val nilai: Double): Expr()
class Sum(val kiri: Expr, val kanan: Expr): Expr()
object NotANumber : Expr()
fun eval(e: Expr): Double = when (e){
    is Const -> e.nilai
    is Sum -> eval(
        e.kanan
    ) + eval(e.kiri)
    NotANumber -> java.lang.Double.NaN
}