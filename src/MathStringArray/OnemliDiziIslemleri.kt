package MathStringArray

import java.util.*

fun main(args: Array<String>) {

    //Dizi kopyalama


    var dizi1= arrayOf(5,1,3,90,4)
    var dizi2 = Array<Int>(5){0}

    System.arraycopy(dizi1,0,dizi2,0,5)
    /*
    for(i in 0..dizi1.size-1){

        dizi2[i]=dizi1[i]

    }*/


    //Dizi Sıralama
  /*  for (sayi in dizi2){
        println(sayi)
    }

    Arrays.sort(dizi2)

    for (sayi in dizi2){
        println(sayi)
    }

    //Dizi karşılaştırma
    println(Arrays.equals(dizi1, dizi2))*/

    var isimler= arrayListOf("emre","ali","hasan")

    isimler.add("melek")
    isimler.add(0,"ayşe")
    for (isim in isimler){
        println(isim)
    }

    println(isimler.get(2))
    println(isimler.size)
    println(isimler.remove("ayşe"))
    //println(isimler.clear())
    isimler.set(0,"yeni değer")
println("*********************************")
    for (isim in isimler){
        println(isim)
    }



}