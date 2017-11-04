package KontrolveDonguYapilari

fun main(args: Array<String>) {

    for (i in 1..10){
        println(i)
    }

    var i :Int = 1

    while(i <= 10){

        println(i)
       // i=i+1
        i++

    }

    //1 ile 100 arasındaki çift sayıların toplamını bulunuz
    var toplam = 0
    for(sayi in 1..100){
        if(sayi % 2 == 0){
           // toplam = toplam + sayi
            toplam += sayi
        }
    }

    println("Toplam : " + toplam)

    var k= 1
    var ciftSayiToplami=0
    while (k <= 100){
        if(k % 2 == 0){

            ciftSayiToplami+=k
        }

        k++
    }


    println("Whiledeki toplam değeri : " + ciftSayiToplami)

    //do while ve while farkı

    var  e = 1

    while(e < 1){
        println("While çalıştı e : " + e)
        e++
    }
    println("While sonu")

    var f=1
    do{

        println("Do while çalıştı f:" + f)
        f++

    }while (f<1)












}