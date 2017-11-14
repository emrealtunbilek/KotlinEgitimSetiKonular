package DataClassGetterSetterEnum

class KitapKotlin{

    var id:Int
        get () = field
        set(value) {
            if(value<0)
                field=1
            else field=value
        }

    var isim:String

    constructor(id:Int, isim:String, kapakRenk: KapakRenk){
        this.id=id
        this.isim=isim
        this.kapakRenk=kapakRenk
    }

    var kapakRenk:KapakRenk

}

enum class KapakRenk{
    KIRMIZI,
    MAVİ,
    YEŞİL
}


fun main(args: Array<String>) {

    var k1:Kitap= Kitap(-9,"sefiller")

    println(k1.ad)
    k1.setId(-80)
    println(k1.getId())

    var k2:KitapKotlin= KitapKotlin(-7, "vadideki zambak", KapakRenk.KIRMIZI)
    println(k2.id)
    k2.id=65
    println(k2.kapakRenk)
    println(k2.id)
}