package OnSorulukBolumTekrarSorulari

fun main(args: Array<String>) {

    /* çözüm 8
    x>0, y<0 ise f(x,y) = 4x+2y+4
x>0, y=0 ise f(x,y) = 2x-y+3
x<0, y>0 ise f(x,y) = 3x+4y+3



    println("x değerini giriniz")
    var x = readLine()!!.toInt()

    println("y değerini giriniz")
    var y = readLine()!!.toInt()

    var sonuc=0

    if(x >0 && y<0){

        sonuc = 4*x + 2*y + 4

    }else if (x>0 && y==0){

        sonuc=2*x - y + 3

    }else if (x<0 && y>0){

        sonuc=3*x +4*y +3

    }else {
        println("Çözüm yok")
    }

    println("Sonuc : " + sonuc)*/

/*
    //ÇÖZÜM 9

    println("Notunuzu giriniz:")
    var notDegeri = readLine()!!.toInt()

    var notSiniri = notDegeri - (notDegeri %10)

    var sonuc = when(notSiniri){

        90  -> "AA"
        80 -> "BA"
        70 -> "BB"
        60 -> "BC"
        50 -> "CC"
        else -> {
            "FF"
        }


    }

    println(sonuc)
    */

    //ÇÖZÜM 10

    for (i in 1..10){

        for (j in 1 .. 10){

            print("$i*$j=" + (i*j)+"\t")

        }
        println()
        println()

    }


























}