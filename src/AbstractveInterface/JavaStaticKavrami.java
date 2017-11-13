package AbstractveInterface;

import NesneyeYonelimliProgramlama.Ogrenci;

public class JavaStaticKavrami {

    public static void main(String[] args) {

        OgrenciJava ogr1=new OgrenciJava(1, "Emre");
        ogr1.bilgileriYazdir();

        OgrenciJava ogr2=new OgrenciJava(2, "Hasan");
        ogr2.bilgileriYazdir();

        OgrenciJava ogr3=new OgrenciJava(3, "Ali");
        ogr3.bilgileriYazdir();


        System.out.println(OgrenciJava.toplamOgrenciSayisi);
        System.out.println(OgrenciJava.toplamOgrenciSayisi);
        System.out.println(OgrenciJava.toplamOgrenciSayisi);
        OgrenciJava ogr4=new OgrenciJava(4, "ddsf");
        ogr4.bilgileriYazdir();

    }

}

class OgrenciJava{

    private int id;
    private String isim;
    public static int toplamOgrenciSayisi=0;

    public OgrenciJava(int idNo, String ad){

        this.id=idNo;
        this.isim=ad;
        toplamOgrenciSayisi++;
    }

    public void bilgileriYazdir(){

        System.out.println("No : " + id + " İsim : " + isim + " Toplam ogrenci sayisi:"+toplamOgrenciSayisi);
    }

}
