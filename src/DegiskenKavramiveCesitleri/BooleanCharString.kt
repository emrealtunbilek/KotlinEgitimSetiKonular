package DegiskenKavramiveCesitleri

fun main(args: Array<String>) {

    var isTrue : Boolean = 5 > 4

    println("istrue değişkeninin değeri " + isTrue)


    var ilkHarf : Char = 'a'
    var ikinciHarf : Char = 'b'

    println("İlk harf : " + ilkHarf + " ikinci harf $ikinciHarf")

    var isim:String = "Emre Altunbilek"

    println("Benim adım $isim" + " ve adımdaki karakter sayısı : " + isim.length)
    println(isim.get(5))

    println("Kotlini Öğreniyoruz \n daha sonra android öğreneceğiz")
    println("""Kotlindeki \n işareti bir alt satıra geçmeyi sağlar""")

}