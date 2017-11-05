package FonksiyonlarMethodlar

fun main(args: Array<String>) {

    toplaminiBul(4,5)
    toplaminiBul(4,5, 2)
    toplaminiBul(4.2, 5.3)
    toplaminiBul(1,2,3,4,5)

    var sayilarDizi = arrayOf(1,2,3,4,5,6,7,8,9,10)
    toplaminiBul(sayilarDizi)


    bilgileriGoster("emre altunbilek")
    bilgileriGoster(29)

  // farkiniBul(5,2)


}

fun toplaminiBul(sayilarDizi: Array<Int>) {

    var toplam = 0
    for(sayi in sayilarDizi){
       toplam=toplam+sayi
    }
    println(toplam)

}

fun toplaminiBul(sayi1:Int, sayi2:Int){
    println(sayi1+sayi2)
}

fun toplaminiBul(sayi1:Double, sayi2:Double){

    println(sayi1+sayi2)
}

fun toplaminiBul(sayi1:Int, sayi2:Int, sayi3:Int){
    println(sayi1+sayi2+sayi3)
}
fun toplaminiBul(vararg sayilar:Int){

    var toplam=0

    for (i in sayilar){
        toplam+=i
    }

    println(toplam)

}

fun bilgileriGoster(isim:String){
    println(isim)
}
fun bilgileriGoster(yas:Int){
    println(yas)
}

/*
veri dönüş tipine göre method aşırı yüklemesi overloading yapılamaz
fun farkiniBul(sayi1:Int, sayi2:Int) : Int{

    return sayi1 - sayi2
}

fun farkiniBul(sayi1:Int, sayi2:Int) : Unit{

    println(sayi1-sayi2)
}
*/