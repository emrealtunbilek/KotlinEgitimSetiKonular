package DosyaIslemleri

import java.io.FileWriter

fun main(args: Array<String>) {

    //dosya olusturma
    var dosya=FileWriter("ilkdosya.txt")

    println("Adınızı giriniz")

    var isim= readLine()!!

    dosya.write(isim+"\n")
    dosya.write("Yaş 29")
    println("Veri dosyaya yazıldı")
    dosya.close()



}