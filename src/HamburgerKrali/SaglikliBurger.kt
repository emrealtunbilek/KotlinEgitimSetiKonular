package HamburgerKrali

class SaglikliBurger(private var etCesidi:String, private var ucret:Double): Hamburger("Sağlıklı Burger", "Kepekli Ekmek", etCesidi, ucret) {

    private var extraSaglikliUrunAdi1:String = ""
    private var extraSaglikliUrunFiyat1 : Double = 0.0

    private var extraSaglikliUrunAdi2:String = ""
    private var extraSaglikliUrunFiyat2 : Double = 0.0

    fun ekleSaglikliUrun1 (ad:String, fiyat:Double){
        this.extraSaglikliUrunAdi1 = ad
        this.extraSaglikliUrunFiyat1=fiyat
    }

    fun ekleSaglikliUrun2 (ad:String, fiyat:Double){
        this.extraSaglikliUrunAdi2 = ad
        this.extraSaglikliUrunFiyat2=fiyat
    }

    override fun hamburgerBilgileri(): Double {
        var toplamUcret = super.hamburgerBilgileri()

        if(!this.extraSaglikliUrunAdi1.isNullOrEmpty()){
            toplamUcret += this.extraSaglikliUrunFiyat1
            println("Extra ürün : ${this.extraSaglikliUrunAdi1}  ücret: ${this.extraSaglikliUrunFiyat1}")
        }

        if(!this.extraSaglikliUrunAdi2.isNullOrEmpty()){
            toplamUcret += this.extraSaglikliUrunFiyat2 !!
            println("Extra ürün : ${this.extraSaglikliUrunAdi2}  ücret: ${this.extraSaglikliUrunFiyat2}")
        }

        return toplamUcret
    }




}