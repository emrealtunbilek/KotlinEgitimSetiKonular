package AbstractveInterface


object JavaStaticKavrami {

    var sinifAdi="JavaStaticKavrami"

    @JvmStatic
    fun main(args: Array<String>) {

        val ogr1 = OgrenciJava(1, "Emre")
        ogr1.bilgileriYazdir()

        val ogr2 = OgrenciJava(2, "Hasan")
        ogr2.bilgileriYazdir()

        val ogr3 = OgrenciJava(3, "Ali")
        ogr3.bilgileriYazdir()


        println(OgrenciJava.toplamOgrenciSayisi)
        println(OgrenciJava.toplamOgrenciSayisi)
        println(OgrenciJava.toplamOgrenciSayisi)
        val ogr4 = OgrenciJava(4, "ddsf")
        ogr4.bilgileriYazdir()

    }

}

internal class OgrenciJava(private val id: Int, private val isim: String) {

    init {
        toplamOgrenciSayisi++
    }

    fun bilgileriYazdir() {

        println("No : $id İsim : $isim Toplam ogrenci sayisi:$toplamOgrenciSayisi")
    }

    companion object {
        var toplamOgrenciSayisi = 0
    }

}
