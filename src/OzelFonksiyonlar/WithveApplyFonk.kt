package OzelFonksiyonlar

class Person{

    var ad:String = ""
    var yas:Int = -1

    fun kendiniTanit(){
        println("Merhaba ben $ad ve $yas yaşındayım")
    }

}

fun main(args: Array<String>) {

    var kisi=Person()
    /*kisi.ad="Emre"
    kisi.yas = 30

    kisi.kendiniTanit()*/

    with(kisi){
        ad="Emre"
        yas = 30
    }

    kisi.kendiniTanit()

    kisi.apply {
        ad = "Hasan"
        yas = 40
    }.kendiniTanit()

}