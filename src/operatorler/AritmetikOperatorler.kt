package operatorler

fun main(args: Array<String>) {

    var sayi1:Int = 15
    var sayi2 = 4

    println("Sayilarin toplamı " + (sayi1 + sayi2))
    println("Sayilarin farkı $sayi1-$sayi2")
    println("Sayiların farkı ${sayi1-sayi2}")

    println("Sayilarin çarpımı " + (sayi1*sayi2))
    println("Sayiların bölümü " + (sayi1/sayi2))

    println("Çarpımı ${sayi1*sayi2}")
    println("Bölümü ${sayi1/sayi2}")

    // % mod almaya yarar. kısacası iki sayının bölümünden kalanı verir

    println("Sayi1 % sayi2 " + (sayi1 % sayi2))


}