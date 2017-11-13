package AbstractveInterface


object Ogr{

    //statik davranış gösterir
    var sayac:Int= 0

    fun sayaciGoster(){

        println("Sayac : " + sayac)

    }




}

fun main(args: Array<String>) {

    Ogr.sayac=85
    Ogr.sayaciGoster()




}