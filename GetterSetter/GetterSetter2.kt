package com.tiaraarista.oopkotlin.GetterSetter

fun  main(args: Array<String>){
    val cewe = Girl()
    cewe.umurAsli = 15
    cewe.umurPalsu = 15
    println("Cewe: UmurAsli = ${cewe.umurAsli}")
    println("Cewe: UmurPalsu = ${cewe.umurPalsu}")
    val tiara = Girl()
    tiara.umurAsli = 20
    tiara.umurPalsu = 17
    println("Tiara: UmurAsli = ${tiara.umurAsli}")
    println("Tiara: UmurPalsu = ${tiara.umurPalsu}")
}
class Girl{
    var umurPalsu: Int = 0
        get() = field
    set(value) {
        field = if (value < 18)
            18
        else if (value >= 18 && value <= 30)
            value
        else
            value -3
    }
    var umurAsli: Int = 0
}