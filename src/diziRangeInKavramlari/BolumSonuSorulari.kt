package diziRangeInKavramlari

fun main(args: Array<String>) {
    //SORU 1 Kullanıcıdan iki sayi alınız (30 ve 20) ve tüm aritmetik operatorleri uygulayarak
    //ekrana bilgi mesajları ile yazdırınız.

    /* SORU 2
    var i:Int = 5;
    i=i++
    i=++i
    println(i)     ifadesini çalıştırmadan çıktısını bulmaya çalışınız*/

    // SORU 3
    // var sonuc:Int = 2 + + 8 - - 2 + + 8 - - 2 + + 8 çıktısı kaçtır ?

    /*SORU 4
    var i:Int = 5

    i= i++ + ++i - i-- - --i
    i kaçtır?
     */

    /*
    //ÇÖZÜM 1
    println("Birinci sayıyı giriniz")
    var sayi1 : Int = readLine()!!.toInt()
    println("İkinci sayıyı giriniz")
    var sayi2: Int = readLine()!!.toInt()

    println("$sayi1 ve $sayi2 toplamı : " + (sayi1+sayi2))
    println("$sayi1 ve $sayi2 farkı : " + (sayi1-sayi2))
    println("$sayi1 ve $sayi2 çarpımı : " + (sayi1*sayi2))
    println("$sayi1 ve $sayi2 bölümü : " + (sayi1.toDouble()/sayi2.toDouble()))
    */

    /*
    //ÇÖZÜM 2
    var i:Int = 5
    i=i++ // i++ veya i = i+1
    i=++i
    println("i değeri : " + i)
    */

    /*
    //ÇÖZÜM 3

    var sonuc:Int = 2 + + 8 - - 2 + + 8 - - 2 + + 8
    // 2 + (+8) - (-2) + (+8) - (-2) + (+8)
    // 2 + 8 + 2 + 8 + 2 + 8
    println("Sonuc : " + sonuc)
*/

    var i:Int = 5

    i= i++ + ++i - i-- - --i

    println("i değeri : " + i)








}