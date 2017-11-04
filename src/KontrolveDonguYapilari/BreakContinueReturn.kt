package KontrolveDonguYapilari

fun main(args: Array<String>) {

    //break continue ve return

    for (i in 1..10) {
        println(i)

        if (i == 7) {
            break
        }
    }

    for (harf in "emrealtunbilek@gmail.com") {
        if (harf == '@') {
            break
        }

        print(harf)
    }

    println()
    var toplam = 0
    for(sayi in 1..10){

        if(sayi == 7)
            continue

        if(sayi == 3)
            //return

        toplam+=sayi

        println("Şuanki Sayi " + sayi)
        println("Şuanki toplam değer" + toplam)

    }

    distakiDongu@ for (i in 4..6){

        for (j in 1..3){

            if(i*j == 12){
                break@distakiDongu
            }

            println("$i * $j : " + (i*j))

        }

    }



}