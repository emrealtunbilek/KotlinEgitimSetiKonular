package KontrolveDonguYapilari

fun main(args: Array<String>) {

    var notDegeri : Int = readLine()!!.toInt()

    var sonuc=when(notDegeri){

        in 0..44 -> {
            println("1 aldın")
            1
        }
        in 45..54 -> {
            println("2 aldın")
            2
        }in 55 .. 69 -> 3
        in 70 .. 84 ->4
        in 85 .. 100 ->5
        else -> {
            println("hatalı giriç")
            -1
        }
    }

    /*
    if(sonuc == -1){
        println("Tekrar deneyin yanlış giriş yaptınız")
    }else {
        println("Sonuc : " + sonuc)
    }*/

    if(sonuc >0 && sonuc < 6){
        println("Sonuc : " + sonuc)
    }else {
        println("Tekrar deneyin yanlış giriş yaptınız")
    }


}