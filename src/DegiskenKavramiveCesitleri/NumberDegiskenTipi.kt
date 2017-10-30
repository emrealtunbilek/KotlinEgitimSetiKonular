package DegiskenKavramiveCesitleri

fun main(args: Array<String>) {

    //Number Veri Türleri
    //byte, short, int , long, float, double

    var byteMin: Byte = Byte.MIN_VALUE
    println("Byte en küçük değeri : " + byteMin) // 8 bit

    var byteMax: Byte = Byte.MAX_VALUE
    println("Byte en büyük değeri : " + byteMax)

    var shortMin: Short = Short.MIN_VALUE      //16 bit
    println("Short en küçük değer " + shortMin)

    var shortMax: Short = Short.MAX_VALUE
    println("Short en büyük değer : " + shortMax)

    var integerMin: Int = Int.MIN_VALUE          //32 bit
    println("Integer en küçük " + integerMin)

    var integerMax: Int = Int.MAX_VALUE
    println("Integer en büyük " + integerMax)

    var longMin: Long = Long.MIN_VALUE   // 64 bit
    println("Long en küçük $longMin")

    var longMax: Long = Long.MAX_VALUE
    println("Long en büyük $longMax")

    var floatMin: Float = Float.MIN_VALUE // 32 bit
    println("Float en küçük ${floatMin}")

    var floatMax: Float = Float.MAX_VALUE
    print("Float en büyük ${floatMax} \n")

    var doubleMin = Double.MIN_VALUE    //64 bit
    println("Double en küçük " + doubleMin)

    var doubleMax = Double.MAX_VALUE
    println("Double en büyük $doubleMax")
    

}