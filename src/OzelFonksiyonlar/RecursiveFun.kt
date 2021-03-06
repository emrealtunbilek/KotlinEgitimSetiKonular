package OzelFonksiyonlar

import java.math.BigInteger

fun main(args: Array<String>) {

   // selamVer()
    println("Normal faktoriyel 70000 ! = " + normalFaktoriyelBul(BigInteger("70000")))
    println("RecVer faktoriyel 70000 ! = " + recursiveFaktoriyel(BigInteger("70000"), BigInteger("1")))

}

fun normalFaktoriyelBul(sayi:BigInteger) : BigInteger {

    var sonuc = BigInteger.ONE // BigInteger("1")
    for (oankiSayi in 1..sayi.toInt())
        sonuc = sonuc * BigInteger("$oankiSayi")

    return sonuc

}

tailrec fun recursiveFaktoriyel(sayi : BigInteger, sonuc:BigInteger= BigInteger.ONE) : BigInteger {

    if (sayi == BigInteger.ZERO){
        return sonuc // BigInteger.ONE
    }else{

        return recursiveFaktoriyel(sayi - BigInteger.ONE, sayi*sonuc)

    }


}

fun selamVer() {
    println("Merhaba")
    selamVer()
}