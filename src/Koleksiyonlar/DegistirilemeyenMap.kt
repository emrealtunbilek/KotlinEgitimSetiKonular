package Koleksiyonlar

fun main(args: Array<String>) {

    //mapof ile degistirlemeyen map
    var map = mapOf<Int, String>(1 to "emre", 2 to "hasan", 3 to "ali")

    println("keyi 2 olan değer " + map.get(2))
    println("keyi 1 olan değer " + map[1])

    for(str in map){

        println(str.key)
        println(str.value)
    }

    var aranacakIfade= readLine()!!
    if(map.containsValue(aranacakIfade)){

        println("$aranacakIfade map de var")

    }else {
        println("$aranacakIfade map de yok")
    }
}