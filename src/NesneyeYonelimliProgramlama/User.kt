package NesneyeYonelimliProgramlama

class User(var id: Int, var isim: String) {

    var adres:String =""

    init {
        if (id < 0){
            id=1
        }
       println("id : $id  isim : $isim")
    }

    constructor(id:Int, isim:String, adres:String) : this(id, isim){

        this.adres=adres
    }

   // constructor(id:Int, isim:String, adres:String, mail:String): this (id, isim)

}

fun main(args: Array<String>) {
    var emre:User = User(100,"emre")


    var yunus:User = User(101, "yunus")


    var ali:User = User(-5, "ali", "ankara")

}