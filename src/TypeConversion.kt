fun main(){
   //  WIEDERHOLUNG: TYPE CONVERSION

    var intValue = "1"
    var intConverted = intValue.toDouble() // 1.0
    println(intValue.toDouble())
    println(intConverted)
    println(intValue)

    // String Variante

    var stringValue = "25.5"
    println(stringValue + 5) // 25.55
    var stringConverted = stringValue.toDouble() + 5 // 25.5 + 5 = 30.5
    println(stringConverted) // 30.5
    println(stringValue)

    println(intValue + stringConverted) // 130.5
    println(intConverted + stringConverted) // 1 + 30.5 = 31.5


}