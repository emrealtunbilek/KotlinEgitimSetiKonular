package MathStringArray

import FonksiyonlarMethodlar.faktoriyelHesapla
import FonksiyonlarMethodlar.topla
import java.util.*

fun main(args: Array<String>) {
/*
    //SORU1
    //10 elemanlı bir diziye eleman olarka dizi indexlerinin faktoriyellerini atayan bir uygulama yazınız
    //1,1, 2, 6 , 24 , 120 ...

    var onElemanliDizi = Array<Int>(10){0}

    for(i in 0..onElemanliDizi.size-1){

        onElemanliDizi[i] = faktoriyelHesapla(i)

    }

    for(index in 0..onElemanliDizi.size-1){
        println("$index. indexteki elemanın değeri "+onElemanliDizi[index])
    }
*/
/*
    //SORU2
//Kullanıcıdan alınan 5 sayıyı diziye atayan ve atama işlemi bittikten sonra ekrana yazdıran uygulamayı yazınız
    var kullanicidanGelenSayilar = Array<Int>(5) { 0 }

    for(index in 0..kullanicidanGelenSayilar.size-1){

        println("Sayı giriniz : ")
        kullanicidanGelenSayilar[index] = readLine()!!.toInt()
    }
    for(sayi in kullanicidanGelenSayilar){
        print(""+sayi + ",")
    }
*/

/*
    //SORU 3
    //çalıştıgında hangi ayda oldugumuzu string olarak belirten uygulamayı yazınız, Calendar sınıfını kullanın

    var aylar= arrayOf("Ocak","Şubat","Mart", "Nisan", "Mayıs", "Haziran", "Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık")

    var suankiAyDegerininIndeksi=Calendar.getInstance().get(Calendar.MONTH)

    println(aylar[suankiAyDegerininIndeksi])
    */



    //SORU 4
    //Boyutu ve elemanlarını kullanıcının belirlediği bir dizinin elemanlarının toplam değerini yazınız

    println("Kaç elemanlı bir dizi olusturacaksın ?")
    var diziBoyutu= readLine()!!.toInt()

    var olusturulanDizi=Array<Int>(diziBoyutu){0}
    var toplam=0

    for (index in 0..olusturulanDizi.size-1){

        println("Sayı giriniz")
        olusturulanDizi[index]= readLine()!!.toInt()
        toplam= toplam + olusturulanDizi[index]

    }

    println("Toplam değer : " + toplam)


}

fun faktoriyelHesapla(s: Int): Int {

    var girilenSayi = s

    if (girilenSayi == 0) {

        return 1
    }
    var sayac = 1
    var faktoriyel = 1
    while (sayac <= girilenSayi) {
        faktoriyel = faktoriyel * sayac
        sayac++
    }
    return faktoriyel
}






