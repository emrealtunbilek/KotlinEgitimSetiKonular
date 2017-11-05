package OnSorulukBolumTekrarSorulari

import java.math.BigInteger

fun main(args: Array<String>) {
/*
    //ÇÖZÜM 4
   for (i in 1..5){

       println("Emre Altunbilek")
   }

    println("***************************")
    var sayac = 0

    while (sayac < 5){

        println("Emre Altunbilek")
        sayac++
    }
    println("***************************")

    var sayac2=0

    do {
        println("Emre Altunbilek")
        sayac2++
    }while (sayac2<5)
    */

    /*
    //ÇÖZÜM 5

    var birdenYuzeKadarSayilar = 1 .. 100
    var toplam = 0

    for (sayi in birdenYuzeKadarSayilar){

        toplam += (sayi * sayi)

    }

    println("1..100 e kadar sayıların kareleri toplamı : " + toplam)
*/

    /*
    //ÇÖZÜM 6

    var sayiAralik = 1..100
    var terstenSayiAralik = 100.downTo(1).step(7)

    for (sayi in sayiAralik.step(7)){
        print("$sayi, ")
    }
    println("\n************************************")
    for(sayi in terstenSayiAralik){
        print("$sayi, ")
    }
    */

    //ÇÖZÜM 7

    println("Faktoriyeli hesaplanacak sayı : ")
    var girilenSayi= readLine()!!.toInt()
    var sayac = 1
    var faktoriyel=1

    while (sayac <= girilenSayi){

        faktoriyel=faktoriyel * sayac
        sayac++

    }
    println("$girilenSayi sayısının faktoriyeli : " + faktoriyel)


























}