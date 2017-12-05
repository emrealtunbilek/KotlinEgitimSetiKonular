package HamburgerKrali

fun main(args: Array<String>) {
    /* Burger Kralı Satış Uygulaması
       Bu uygulamanın amacı işletmenin hamburger satış işlemlerini gerçekleştirmesini sağlamaktır.
       Uygulama hamburger bilgilerini ve satış bilgilerini tutacaktır.
       Mağazada 3 çeşit hamburger bulunmaktadır.

        1)Sade Hamburger : Ekmek türü ve İçindeki Et çeşidi ve 4 tane extra bilgisi alabilir.
          Müşterinin istediği extra şeyler (sos, domates, peynir gibi) toplam fiyata dahil edilmelidir.

        2)Sağlıklı Burger : Bu burgerın ekmek türü kepeklidir. 6 taneye kadar ekstra ürün daha içerebilir.

        3)Baba Burger : Bu burger da patates kızartması ve içecek kendinden tanımlıdır. Ekstra ürün içeremez.

    Fiyatları kendiniz beliryebilirsiniz.
    Önemli olan bu yapıyı nesneye yönelimli programlama öğelerini kullanarak gerçekleştirebilmeniz..
    */

    val h1:Hamburger= Hamburger("Sade", "Beyaz", "Kırmızı", 8.8)
    h1.ekleExtraUrun1("Ketçap", 1.5)
    h1.ekleExtraUrun2("Soğan halkası", 3.4)

    var toplamUcret= h1.hamburgerBilgileri()
    println("Toplam ücret : $toplamUcret")

    val s1:SaglikliBurger= SaglikliBurger("Balık", 11.0)
    s1.ekleExtraUrun3("Susam", 2.0)
    s1.ekleSaglikliUrun1("Zencefil", 3.5)
    toplamUcret=s1.hamburgerBilgileri()
    println("Sağlıklı hamburger toplam fiyat : $toplamUcret ")

    var b1:BabaBurger= BabaBurger()
    b1.ekleExtraUrun1("Mayonez", 2.0)
    toplamUcret = b1.hamburgerBilgileri()
    b1.ekleExtraUrun2("Mayonez", 2.0)
    println("Baba hamburger toplam fiyat : $toplamUcret ")

}