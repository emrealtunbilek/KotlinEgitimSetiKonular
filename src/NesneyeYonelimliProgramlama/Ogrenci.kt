package NesneyeYonelimliProgramlama

class Ogrenci (isim:String, yas:Int) {

    var gelenIsim : String
    var gelenYas : Int

    init {
        this.gelenIsim = isim
        this.gelenYas = yas
        println("İnit blogu calıstı")
        println("Isim : $isim Yas: $yas")
    }
    
    fun bilgileriGoster(){
        println("Isim : $gelenIsim Yas: $gelenYas")
    }

}

fun main(args: Array<String>) {

    var ogr1:Ogrenci = Ogrenci("emre",29)
    var ogr2:Ogrenci = Ogrenci("emre", 52)
    ogr1.bilgileriGoster()


}