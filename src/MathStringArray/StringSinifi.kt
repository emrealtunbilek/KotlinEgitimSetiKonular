package MathStringArray

fun main(args: Array<String>) {

    var takim = "Galatasaray"

    println(takim)
    println("Galata" + "saray")
    println(takim.length)
    println(takim.get(0) + "" + takim.get(1))
    println(takim.substring(0,6))
    println(takim)

    println(takim.indexOf('s'))
    println(takim.lastIndexOf('a'))
    println(takim.replace('G', 'B'))
    println(takim.toUpperCase())
    println(takim.toLowerCase())





    /*var isim = "Emre Altunbilek"
    var yas = "29"

    println(isim + 1)
    println(yas.toInt() + 1)
    println("İsim : " + isim + " Yaş $yas")

    for (tekKarakter in isim){
        println(tekKarakter)
    }

    var okul = "ege"

    for (i in 0..okul.length-1){
        print(okul[i])
    }*/


}