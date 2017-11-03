package diziRangeInKavramlari

fun main(args: Array<String>) {

    //1 ile 20 arasındaki sayılar

    var sayilar = 1..20
    var adanZye = 'a'..'z'

    var sayilarTersten = 20..1
    var harfleTerstemn = 'z'..'a'

    var oneToTwenty = 1.rangeTo(20)
    var oneToTwentyReverse = 20.downTo(1)

    var beserBeserSayilar = 0.rangeTo(100).step(5)
    var beserBeserSayilarReverse = 100.rangeTo(5).step(5)

    var elemanVarMi = 10 in beserBeserSayilar

    println("11 range içinde mi : " + elemanVarMi)
    println(beserBeserSayilar.first)
    println(beserBeserSayilar.last)
    println(beserBeserSayilar.step)






}