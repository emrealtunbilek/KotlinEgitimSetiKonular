package operatorler

fun main(args: Array<String>) {


    var sart1 = true
    var sart2= false

    println(sart1 && sart2)
    //and işleminde tüm koşullar true olmalı aksi taktirde sonuç false

    //or (veya)

    //35 yasından küçük olsun veya doktor

    var sart3 = false
    var sart4 = false

    println(sart3 || sart4)
    //or işleminde tüm koşullar false ise sonuç false olur, aksi taktirde sonuç true

    //Değil (Not)

    var sart5 = true
    var sart6=false

    println(!sart5)
    println(!sart6)

    //ARTIRMA  VE AZALTMA
    //++ Sayı veya değişkni 1 artırır
    //-- Sayı veya değişkeni 1 azaltır.

    var sayi = 16

    //sayi=sayi+1
    //sayi+=1
    //sayi++
    println(++sayi)
    println(sayi)

    var sayi2=22

    println(sayi2--)
    println(sayi2)

    println(--sayi2)
    println(sayi2)




}