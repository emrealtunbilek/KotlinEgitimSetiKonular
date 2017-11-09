package Kalitim

open class Person2{

    var isim:String
    var yas:Int
    var isMan:Boolean=false

    constructor(isim:String, yas:Int){
        this.isim=isim
        this.yas=yas
    }

    constructor(isim: String, yas: Int, isMan:Boolean) : this(isim, yas){
        this.isMan=isMan
    }

    override fun toString(): String {
        var cinsiyet = if (isMan) "erkek" else "kadın"
        return "isim:$isim yas:$yas cinsiyet $cinsiyet"
    }

     open fun bilgileriGoster() : String {
        var cinsiyet = if (isMan) "erkek" else "kadın"
        return "isim:$isim yas:$yas cinsiyet $cinsiyet"
    }

}

class Ogretmen2:Person2{

    var brans:String

    constructor(isim:String, yas:Int, isMan:Boolean, brans:String):super(isim, yas, isMan){

        this.brans=brans

    }

    override fun toString(): String {
        return super.toString() + " brans $brans"
    }

    override fun bilgileriGoster(): String {
        return super.bilgileriGoster() + " brans : $brans"
    }




}

fun main(args: Array<String>) {
    var p1:Person2=Person2("emre", 29, true)
    println(p1.toString())

    var p2:Person2=Person2("fatma", 35)
    println(p2.toString())

    var ogr1:Ogretmen2= Ogretmen2("mahmut", 65, true,"Tarih")
    println(ogr1)
    println(ogr1.bilgileriGoster())
}