package Koleksiyonlar

//hashmapof ile mutablemapof

fun main(args: Array<String>) {

    var degistirilebilen = mutableMapOf<String, String>("1" to "emre" , "2" to "hasan")
    degistirilebilen.put("3", "ali")

    //okuma
    println(degistirilebilen.get("2"))
    println(degistirilebilen["3"])

    //ekleme
    degistirilebilen.put("4", "melek")

    //güncelleme
    degistirilebilen.set("1", "yeni emre")

    for(oankiEleman in degistirilebilen){

        println(oankiEleman.value)
        println(oankiEleman.key)

    }


    //eleman silerken
    degistirilebilen.remove("3")
    for(oankiEleman in degistirilebilen){

        println(oankiEleman.value)

    }



}