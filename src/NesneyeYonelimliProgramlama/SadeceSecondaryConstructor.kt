package NesneyeYonelimliProgramlama

 class Kare{

    var tekKenar : Int = 0

    constructor(){

        this.tekKenar = 0

    }

    fun kareninAlaniniHesapla() : Int{

        return tekKenar * tekKenar
    }

    constructor(kenar: Int ){
        this.tekKenar = kenar
    }


}

fun main(args: Array<String>) {

    var k1 = Kare()
    println("k1 nin alanı : " +k1.kareninAlaniniHesapla())

    var k2 = Kare(5)
    println("k2 nin alanı : " +k2.kareninAlaniniHesapla())



}