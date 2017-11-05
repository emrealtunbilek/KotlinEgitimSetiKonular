package FonksiyonlarMethodlar

fun main(args: Array<String>) {

    var toplam = topla(5,9)
    println("main fundaki toplam değeri " + toplam)

   // var gelenString = selamVer("Emre")
    println(selamVer("emre"))

    var sayi= readLine()!!.toInt()
    var hesaplananFaktoriyel = faktoriyelHesapla(sayi)

    println(hesaplananFaktoriyel)
    println(faktoriyelHesapla(sayi))


}

fun topla(sayi1:Int, sayi2:Int) : Int{

    var t = sayi1 + sayi2
    println("topla fonksiyonundaki Toplam : " + t)

    return t

}

fun selamVer (isim:String) : String {

    return "Merhaba " + isim

}

fun faktoriyelHesapla(s:Int) : Int{

    var girilenSayi= s
    var sayac = 1
    var faktoriyel=1

    while (sayac <= girilenSayi){

        faktoriyel=faktoriyel * sayac
        sayac++

    }

    return faktoriyel


}


//kullanıcıdan aldıgı sayının faktoriyelini hesaplayan methodu yazınız