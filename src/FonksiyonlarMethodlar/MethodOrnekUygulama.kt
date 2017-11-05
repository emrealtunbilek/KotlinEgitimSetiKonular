package FonksiyonlarMethodlar

import java.util.*

fun main(args: Array<String>) {

    fun yasimiGoster() = 30
  yasimiGoster()
    fun xxx(x:Int, y:Int):Int =x+y
    xxx(5,6)



    while (true){
        var kullaniciSecimi = menuGosterMethod()

        if(kullaniciSecimi == 5){
            break
        }

        if(kullaniciSecimi in 1..4) {
            println("Birinci sayıyı giriniz")
            var sayi1 = readLine()!!.toInt()

            println("İkinci sayıyı giriniz")
            var sayi2 = readLine()!!.toInt()


            when (kullaniciSecimi) {

                1 -> toplamaYap(sayi1, sayi2)
                2 -> farkiniNul(sayi1, sayi2)
                3 -> carpmaYap(sayi1, sayi2)
                4 -> bolmeYap(sayi1, sayi2)
                else -> {
                    println("Hatalı giriş")
                }

            }
        }
    }




}

fun bolmeYap(sayi1: Int, sayi2: Int) {

    if(sayi2 != 0)
    println("Sayıların bölümü : " + (sayi1/sayi2))
    else println("Bölen 0 olamaz")
}

fun carpmaYap(sayi1: Int, sayi2: Int) {

    println("Sayıların çarpımı  : " + (sayi1*sayi2))
}

fun farkiniNul(sayi1: Int, sayi2: Int) {

    println("Sayıların farkı  : " + (sayi1-sayi2))
}

fun toplamaYap(sayi1: Int, sayi2: Int) {

    println("Sayıların toplamı : " + (sayi1+sayi2))

}

fun menuGosterMethod() : Int{

    var tarih = tarihGoster()

    println("************ MENU | $tarih ***********")
    println("1 - Topla")
    println("2 - Fark")
    println("3 - Çarpma")
    println("4 - Böl")
    println("5 - Çıkış")
    println("Seçimizin : ")

    var secim = readLine()!!.toInt()

    return secim


}

fun tarihGoster(): String {

    val calendar = Calendar.getInstance()
    var saat = calendar.get(Calendar.HOUR)
    var dakika = calendar.get(Calendar.MINUTE)
    var saniye = calendar.get(Calendar.SECOND)

    return "$saat:$dakika:$saniye "

}
