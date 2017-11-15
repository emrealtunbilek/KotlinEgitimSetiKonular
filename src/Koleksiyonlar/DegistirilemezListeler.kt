package Koleksiyonlar

//List
//mutable immutable

//immutable : listOf() veya listOfNotNull()

fun main(args: Array<String>) {

    var listOfListesi = listOf(2,3,"emre", true, null, 5.4)

    for(oankiEleman in listOfListesi){

        println(oankiEleman)
    }
    println(listOfListesi.get(3))
    println(listOfListesi[3])

    var s1=listOfListesi.get(0) as Int
    var s2 = listOfListesi.get(1) as Int

    println(s1+s2)
    println(listOfListesi.size)

    var listOfNotNullListesi = listOfNotNull(2,3,"emre", true, null, 5.4, null)
    println(listOfNotNullListesi.size)



}