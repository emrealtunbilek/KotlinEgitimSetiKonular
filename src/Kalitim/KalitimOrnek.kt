package Kalitim

open class Person(open var isim:String, yas:Int, isMan:Boolean){


    open var yas:Int = 0
    var isMan:Boolean

    init {

        println("person sınıfının initi tetiklendi")
        this.yas = yas
        this.isMan=isMan
    }

    override fun toString(): String {

        var cinsiyet = if (isMan) "erkek" else "kadın"

        return "isim:$isim yas:$yas cinsiyet $cinsiyet"
    }

}

class Ogretmen(override var isim:String, override var yas:Int, isMan:Boolean, brans:String) : Person(isim, yas, isMan){

    var brans:String

    init {
        println("Ogretmen sınıfının initi tetiklendi")

        if(yas < 0){
            yas = 999
        }

        this.brans = brans
    }

    override fun toString(): String {
        return super.toString() + " brans $brans"
    }

}

fun main(args: Array<String>) {

    var p1:Person=Person("emre",29,true)
    println(p1)

    var ogr1:Ogretmen= Ogretmen("fatma",-9,false,"matematik")
    println(ogr1)

}