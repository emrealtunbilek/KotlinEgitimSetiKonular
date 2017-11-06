package NesneyeYonelimliProgramlama

class Person {

    var isim:String = "Emre"
    var yas : Int = 29

    fun selamVer(){
        println("Merhaba")
    }

    fun dogduguYil () = 2017 - yas

}

fun main(args: Array<String>) {

    var kisi:Person = Person()

    println(kisi.isim)
    println(kisi.yas)
    kisi.selamVer()
    println(kisi.dogduguYil())

    var kisi2:Person = Person()
    kisi2.isim="ahmet"
    var kisi3:Person = Person()
}