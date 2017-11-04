package diziRangeInKavramlari

fun main(args: Array<String>) {


    println("İsminizi giriniz :")
     var isim : String? = readLine()
    println("Soyadınızı giriniz")
    var soyisim : String = readLine() !!

    println("yaşınızı girin:")
    var yas : Int = readLine()!!.toInt()

    println("ad : ${isim?.length} soyad : ${soyisim.length} yaş: $yas")



}