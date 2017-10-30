package DegiskenKavramiveCesitleri

/*Adınızı, Soyadınızı, Yasınızı,kilonuzu, boyunuzu, cinsiyetinizi (E-->Erkek, K-->kadın)
* ilgili değişkenlere veya sabitlere atayın ve aşağıdaki formule göre boy/kilo endeksinizi hesaplayıp
* tüm verileri ekrana yazdıran programı yazınız
*
* NASIL HESAPLANIR
*   Sağlıklı bir kiloda olup olmadığınızı öğrenmek için, kilo ve boy orantınızı hesaplayın.
    Boy (M) X Boy(M) = Boy Çarpımı
    Kilo (Kg) / Boy Çarpımı = Vücut Kitle İndeksiniz.
        VÜCUT KİTLE İNDEKSİNİZ:
        18.5 kg/m2'nin altında ise: Zayıf.
        18.5-24.9 kg/m2 arasında ise: Normal.
        25-29.9 kg/m2 arasında ise : Fazla kilolu.
*
* */

fun main(args: Array<String>) {

    //ilgili veriler değişkenlere atandı
    val isim:String ="Emre"
    val soyisim:String = "Altunbilek"
    var yas:Byte = 29
    var kilo:Double =81.4
    var boy:Double = 1.78
    val cinsiyet:Char = 'E'

    // boy kilo endex hesaplaması
    var boyDegerininKaresi : Double = boy * boy
    var boyKiloEndex : Double = kilo / boyDegerininKaresi

    //bilgi mesajlarının yazılması
    println("Adı : " + isim + " Soyadı : " + soyisim)
    println("Yaş : $yas Cinsiyet : $cinsiyet")
    println("Kilo : $kilo Boy : $boy")
    println("Boy Kilo Endeksiniz : " + boyKiloEndex)
}