package HamburgerKrali

class BabaBurger : Hamburger("Baba Burger", "beyaz", "Kırmızı", 15.40) {

    init {
        super.ekleExtraUrun1("Patates Kızartması", 2.5)
        super.ekleExtraUrun2("Kola", 3.4)
    }

    override fun ekleExtraUrun1(ad: String, ucret: Double) {
        println("ILAVE URUN EKLEYEMEZSINIZ")
    }

    override fun ekleExtraUrun2(ad: String, ucret: Double) {
        println("ILAVE URUN EKLEYEMEZSINIZ")
    }

    override fun ekleExtraUrun3(ad: String, ucret: Double) {
        println("ILAVE URUN EKLEYEMEZSINIZ")
    }

    override fun ekleExtraUrun4(ad: String, ucret: Double) {
        println("ILAVE URUN EKLEYEMEZSINIZ")
    }
}