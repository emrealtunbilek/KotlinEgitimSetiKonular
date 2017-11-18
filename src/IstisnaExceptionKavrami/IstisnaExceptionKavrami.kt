package IstisnaExceptionKavrami

import java.lang.Exception

fun main(args: Array<String>) {

    var dizi=Array<Int>(3){0}

    dizi[0] = 0
    dizi[1] = 1
    dizi[2] = 2


    try {
        istisna1(dizi)
    }catch (hata : Exception){
        println("Hata : " + hata.toString())
    }

    println("Main metotu sonlandı")


}

fun istisna1(dizi: Array<Int>) {

    println("ıstisna 1 basladı")


    istisna2(dizi)




    println("ıstisna 1 bitti")

}

fun istisna2(dizi: Array<Int>) {

    println("Istisna 2 basladı ")


        for (i in 0..3){
            println("Sayı : " + dizi[i])

        }


    println("Istisna 2 bitti")

}

