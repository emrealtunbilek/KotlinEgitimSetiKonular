package AbstractveInterface

fun main(args: Array<String>) {

    JavaStaticKavrami.main(args)

    var test:JavaStaticKavrami= JavaStaticKavrami
    test.sinifAdi="Yeni sınıf"
    println(JavaStaticKavrami.sinifAdi)

    var test2:JavaStaticKavrami=JavaStaticKavrami

    test2.sinifAdi="Yeni Sınıf test2"
    println(test2.sinifAdi)

    println(test.sinifAdi)

    var ogr1=OgrenciJava(9,"sasa")



}




