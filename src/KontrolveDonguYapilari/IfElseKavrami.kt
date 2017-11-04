package KontrolveDonguYapilari

fun main(args: Array<String>) {
/*
    var yas:Int = 5

    if (yas > 18) {
        println("Yaşınız 18den büyük")
        println("Ehliyet alabilirsiniz")
    }else if(yas >15 && yas <18){

        println("Az daha sabret")

    }else {

        println("Daha çok küçüksün")

    }

    println("Program sonu")
 */
    println("Notunuzu Giriniz")
    var notDegeri : Int = readLine()!!.toInt()
    var karneNotu : Int = 0

    var sonuc = if(notDegeri in 0..44){
        println("1 aldın")
        karneNotu = 1
        "A"
    }else if (notDegeri in 45..54){
        println("2 aldın")
        karneNotu = 2
    }else if (notDegeri in 55 .. 69){
        println("3 aldın")
        karneNotu = 3
       true
    }else if(notDegeri in 70 .. 84){
        println("4 aldın")
        karneNotu = 4
        3.45
    }else if (notDegeri in 85 .. 100){
        println("Tebrikler 5 aldın")
        karneNotu = 5
        "E"
    }else {

        println("hatalı giriş")
"F"
    }
    println("Karneye yansıyacak notun : " + karneNotu)
    println("sonuc : " + sonuc)



}