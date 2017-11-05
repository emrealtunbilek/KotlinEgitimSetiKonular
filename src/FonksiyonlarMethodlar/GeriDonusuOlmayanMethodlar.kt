package FonksiyonlarMethodlar

fun main(args: Array<String>) {

   // isimYazdir()
    ismiParametreIleYazdir("Emre Altunbilek", 29)

    menuGoster()



}

fun ismiParametreIleYazdir(isim : String , yas:Int) {

    println(isim)
    println("Yaş : " + yas)

}

fun isimYazdir(){
    println("Emre Altunbilek")
    println("29")
}

private fun menuGoster(){

    println("MENU GOSTER")
    println("1 - Iki sayının toplamını bul")
    println("2 - Iki sayının farıkını bul")
    println("3 - Iki sayının çarpımı bul")

}

