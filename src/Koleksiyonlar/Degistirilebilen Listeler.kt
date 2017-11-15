package Koleksiyonlar

fun main(args: Array<String>) {
    //mutablelistof arraylistof


    var degisebilenListe=ArrayList<Int>(50)//initial capacity zorunlu değil
    var arrayListOfListesi= mutableListOf<Any?>("emre", "hasan", 3, null,false)

    //ekleme
    arrayListOfListesi.add("ali")
    arrayListOfListesi.add(null)
    arrayListOfListesi.add(9.8)

    for (oankiEleman in arrayListOfListesi){

        println(oankiEleman)
    }

    //güncelleme
    arrayListOfListesi.set(1, "yeni hasan")

    for (oankiEleman in arrayListOfListesi){

        println(oankiEleman)
    }

    //sil
    arrayListOfListesi.remove("yeni hasan")
    arrayListOfListesi.removeAt(0)

    for (oankiEleman in arrayListOfListesi){

        println(oankiEleman)
    }

    println("Size : " + arrayListOfListesi.size)
    println()

}