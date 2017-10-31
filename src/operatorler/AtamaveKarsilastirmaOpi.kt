package operatorler

fun main(args: Array<String>) {

    var sayi = 5

    //+=
    sayi += 5 // sayi  = sayi + 5
    println("Sayinin ilk hali 5, son hali " + sayi)

    //-=

    sayi -= 2 // sayi = sayi - 2
    println(sayi)

    //*=

    sayi *=3 // sayi = sayi * 3
    println(sayi)

    // /=
    sayi /= 6 // sayi = sayi / 6
    println(sayi)

    // %=

    sayi %=3 // sayi = sayi % 3
    println(sayi)

    //Karşılaştırma Operatorler <, > , <=, >=, ==, !=

    var sayi1 = 13
    var sayi2 = 7
    var sonuc : Boolean

    sonuc= sayi1 > sayi2 //true
    println(sonuc)

    sonuc= sayi < sayi2  //false
    println(sonuc)

    sonuc = (sayi1 == sayi2)
    println(sonuc)

    sonuc = sayi1 != sayi2
    println(sonuc)



}