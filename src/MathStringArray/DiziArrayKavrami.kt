package MathStringArray

import java.util.*


fun main(args: Array<String>) {


    var sayilarDizisi = Array<Int>(3){0}

    var kelimelerDizisi = Array<String>(10){""}


    for(i in 0..sayilarDizisi.size-1){

        sayilarDizisi[i] = i+10
        println(sayilarDizisi[i])

    }

    var degiskenlerim = arrayOf("emre",3, true, 3.5)

    for (i in degiskenlerim){
        println(i)
    }

    degiskenlerim[0] = "ahmet"
    degiskenlerim[1] = 5
    degiskenlerim[2] = false
    degiskenlerim[3] = 0.5


    for (i in degiskenlerim){
        println(i)
    }








}

