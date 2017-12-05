package HamburgerKrali

open class Hamburger(private var isim: String, private var ekmekCesidi: String, private var etCesidi: String, private var ucret: Double) {

    private var extraUrunAd1: String = ""
    private var extraUrunFiyat1: Double = 0.0

    private var extraUrunAd2: String? = null
    private var extraUrunFiyat2: Double? = null

    private var extraUrunAd3: String = ""
    private var extraUrunFiyat3: Double = 0.0

    private var extraUrunAd4: String? = null
    private var extraUrunFiyat4: Double? = null

    open fun ekleExtraUrun1(ad: String, ucret: Double) {
        this.extraUrunAd1 = ad
        this.extraUrunFiyat1 = ucret
    }

   open fun ekleExtraUrun2(ad: String, ucret: Double) {
        this.extraUrunAd2 = ad
        this.extraUrunFiyat2 = ucret
    }

    open fun ekleExtraUrun3(ad: String, ucret: Double) {
        this.extraUrunAd3 = ad
        this.extraUrunFiyat3 = ucret
    }

    open fun ekleExtraUrun4(ad: String, ucret: Double) {
        this.extraUrunAd4 = ad
        this.extraUrunFiyat4 = ucret
    }

    open fun hamburgerBilgileri(): Double {

        var toplamUcret = this.ucret
        println("Hamburger adı : ${this.isim}  Ekmek : ${this.ekmekCesidi} Et : ${this.etCesidi} ÜCRET : ${this.ucret}")

        if(!this.extraUrunAd1.isNullOrEmpty()){
            toplamUcret += this.extraUrunFiyat1
            println("Extra ürün : ${this.extraUrunAd1}  ücret: ${this.extraUrunFiyat1}")
        }

        if(!this.extraUrunAd2.isNullOrEmpty()){
            toplamUcret += this.extraUrunFiyat2 !!
            println("Extra ürün : ${this.extraUrunAd2}  ücret: ${this.extraUrunFiyat2}")
        }

        if(!this.extraUrunAd3.isNullOrEmpty()){
            toplamUcret += this.extraUrunFiyat3
            println("Extra ürün : ${this.extraUrunAd3}  ücret: ${this.extraUrunFiyat3}")
        }

        if(!this.extraUrunAd4.isNullOrEmpty()){
            toplamUcret += this.extraUrunFiyat4 !!
            println("Extra ürün : ${this.extraUrunAd4}  ücret: ${this.extraUrunFiyat4}")
        }

        return toplamUcret

    }


}