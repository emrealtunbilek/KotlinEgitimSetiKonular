package AbstractveInterface

class DisSinif{

    var sinifAdi="Dış Sınıf"

    fun selamVerDisSinif(){
        println("Dış sınıftan merhaba ")
    }

    inner class IcSinif{

        var sinifAdi="İç Sınıf"
        fun selamVerIcSinif(){
            selamVerDisSinif()
            println("İç sınıftan merhaba ")
        }

        inner class EnIctekiSinif{

            fun enictekiMethod(){

                selamVerDisSinif()
                selamVerIcSinif()
                println("En içteki sınıftan merhaba")

            }

        }


    }
}

fun main(args: Array<String>) {
    var disSinif=DisSinif()
    println( disSinif.sinifAdi)
    disSinif.selamVerDisSinif()

   // var icsinif=DisSinif.IcSinif()
    var icsinif=DisSinif().IcSinif()
    println(icsinif.sinifAdi)
    icsinif.selamVerIcSinif()

    var enictekiSinif=DisSinif().IcSinif().EnIctekiSinif()
    enictekiSinif.enictekiMethod()
}