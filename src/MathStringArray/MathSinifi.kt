package MathStringArray

fun main(args: Array<String>) {

    println(Math.E)
    println(Math.PI)
    println(Math.abs(-9))//girilen sayının mutlak değeri
    println(Math.ceil(8.9))//bir üst sayıya dönüştürür
    println(Math.floor(7.5))//bir alt sayıya yuvarlar

    println(Math.pow(2.0, 5.0))
    println(Math.pow(5.0,2.0))

    println(Math.sqrt(81.0))
    println(Math.max(8,4))
    println(Math.min(8,4))

    println((Math.random()* 100).toInt()) // rasteglee sayı üretir 0-1 arası değer üretir

    //SORU 1 dik kenarları x olan ikinzkenar üçgenin allanını bulunuz.

    println("Üçgenin bir kenarını giriniz")

    var kenarUzunlugu = readLine()!!.toInt()
    var alan:Double = (Math.pow(kenarUzunlugu.toDouble(), 2.0))/2

    println("Kenar uzunlugu $kenarUzunlugu olan üçgenin alanı : " + alan)

    //SORU 2 0-50 arasında rastgele üretilen sayıların önce büyüğünü
    //sonra küçüğünü ekrana yazdırın

    var sayi1:Int = (Math.random() * 50 ).toInt()
    var sayi2:Int = (Math.random() * 50 ).toInt()

    println("Üretilen sayıların büyüğü " + Math.max(sayi1, sayi2))
    println("Üretilen sayıların küçüğü " + Math.min(sayi1, sayi2))




}