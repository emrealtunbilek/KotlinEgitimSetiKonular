package operatorler

fun main(args: Array<String>) {


    // () -> parantez içi
    // ++ ve -- Değişken önce ++sayi
    // ^
    // * ve /
    // + ve -
    // = atama
    // ++ ve -- Değişken sonra sayi++

    var sayi1=15
    var sayi2=5
    var sonuc:Int

    sonuc = ( sayi1 + sayi2 * 2 - sayi2) + sayi2 - sayi1 * 5 + sayi2

    println(sonuc)

    sonuc = 0

    sonuc = ( sayi1 * sayi2 + 4 / 2) + sayi1++ * sayi2
    println(sonuc)





}