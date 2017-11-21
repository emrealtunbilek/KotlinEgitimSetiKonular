package OzelFonksiyonlar

import java.math.BigInteger

fun main(args: Array<String>) {

   // selamVer()
    println("Normal faktoriyel 70000 ! = " + normalFaktoriyelBul(BigInteger("70000")))
    println("RecVer faktoriyel 70000 ! = " + recursiveFaktoriyel(BigInteger("70000")))

}

fun normalFaktoriyelBul(sayi:BigInteger) : BigInteger {

    var sonuc = BigInteger.ONE // BigInteger("1")
    for (oankiSayi in 1..sayi.toInt())
        sonuc = sonuc * BigInteger("$oankiSayi")

    return sonuc

}

fun recursiveFaktoriyel(sayi : BigInteger) : BigInteger {

    if (sayi == BigInteger.ZERO){
        return BigInteger("1") // BigInteger.ONE
    }else{

        return sayi * recursiveFaktoriyel(sayi - BigInteger.ONE)

    }


}

fun selamVer() {
    println("Merhaba")
    selamVer()
}