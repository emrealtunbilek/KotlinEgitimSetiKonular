package AbstractveInterface

abstract class Calisan {

    open var pozisyon:String="Çalışan"

    abstract fun calis()
    open fun soyutOlmayanMethod(){

        println("Soyut olmayan method")
    }

}

open class Mudur : Calisan(){

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

    override var pozisyon: String = "Müdür"



    override fun soyutOlmayanMethod() {
        println("Müdür soyut olmayan methodu override etti")
    }



}

class GenelMudur : Mudur(){

    override var pozisyon: String = "Genel Müdür"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

}

open class Programci : Calisan(){

    override var pozisyon: String = "Programcı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }
}

class AnalizProgramci : Programci(){

    override var pozisyon: String = "Analiz programcı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

}

class SistemProgramcisi : Programci(){
    override var pozisyon: String = "Sistem programcısı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

    fun sistemiIncele(){
        println("Sistemi inceliyor")
    }
}

class Pazarlamaci : Calisan(){

    override var pozisyon: String = "Pazarlamacı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }
}

fun main(args: Array<String>) {

    /* var calisanlar=Array<Any>(4){Any()}

     calisanlar[0]=Calisan() //yukarı çevrim upcasting
     calisanlar[1]=Mudur()
     calisanlar[2]=Programci()
     calisanlar[3]=Pazarlamaci()*/

    var calisanlar=Array<Calisan>(7){SistemProgramcisi()}

    calisanlar[0]=Pazarlamaci() //yukarı çevrim upcasting
    calisanlar[1]=Mudur()
    calisanlar[2]=Programci()
    calisanlar[3]=Pazarlamaci()
    calisanlar[4]=GenelMudur()
    calisanlar[5]=AnalizProgramci()
    calisanlar[6]=SistemProgramcisi()


    //mesaiyeBasla(calisanlar)
    mesaiyeBaslaPolimorfizm(calisanlar)


}

fun mesaiyeBasla(calisanlar: Array<Any>) {

    for (oankiCalisan in calisanlar){

        if (oankiCalisan is Calisan){
            var calisan:Calisan=oankiCalisan // aşağıya çevrim
            calisan.calis()
        }else if(oankiCalisan is Mudur){

            var mudur:Mudur=oankiCalisan
            mudur.calis()

        }else if(oankiCalisan is Programci){
            var programci:Programci= oankiCalisan
            programci.calis()
        }else if(oankiCalisan is Pazarlamaci) {
            var pazarlamaci:Pazarlamaci=oankiCalisan
            pazarlamaci.calis()
        }


    }


}

fun mesaiyeBaslaPolimorfizm(calisanlar: Array<Calisan>){

    for (oankiCalisan in calisanlar){

        oankiCalisan.calis()

        if(oankiCalisan is SistemProgramcisi){
            oankiCalisan.sistemiIncele()
        }

    }

}