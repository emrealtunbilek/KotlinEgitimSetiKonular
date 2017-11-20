package OzelFonksiyonlar

fun main(args: Array<String>) {

    println("Normal faktoriyel 5! = " + faktoriyelBul(5))
    println("Extension faktoriyel 8! = " + 8.faktoriyelBulExt())

    var yazi="Emre                         Altunbilek \t Kotlin"
    println(yazi)

    println("Düzenlenmiş hali : " + yazi.boslukDuzenle())


}

fun faktoriyelBul(sayi:Int) : Int {

    var sonuc = 1

    for(i in 1..sayi)
        sonuc=sonuc*i

    return sonuc


}

fun Int.faktoriyelBulExt() : Int {

    var sonuc = 1

    for(i in 1..this)
        sonuc=sonuc*i

    return sonuc

}

fun String.boslukDuzenle() : String{

    var regex=Regex("\\s+")
    return regex.replace(this, " ")



}

