package AbstractveInterface


interface Hayvan {//interfaceler sınıf değildir

     fun avlan() // interfacedelerde methodlarlar abstract ve publictir
    fun interfaceTest(){//final değildir ve publictir

        println("Interface methodu")

    }

}

abstract class Kedigiller : Hayvan{

     abstract fun takipEt()

}

open class Kedi : Kedigiller(){
    override fun avlan() {

    }

    override fun takipEt() {
      println("Kedi sınıfı tkaipet calıstı")
    }


}

class Kaplan : Kedi(){

    override fun takipEt() {
        println("Kaplan sınıfı takip calıstı")
    }


    override fun avlan() {
        super.avlan()
    }


}

fun main(args: Array<String>) {
    //var interFace=Hayvan()  interfacelerden nesne üretilemez
    var h:Hayvan=Kaplan() // burda sıkıntı yok
}