fun main() {

    // WIEDERHOLUNG: TYPE CONVERSION
//
//    var intValue = "1"
//    var intConverted = intValue.toDouble() // 1.0
//    println(intValue.toDouble())
//    println(intConverted)
//    println(intValue)
//
//    // String Variante
//
//    var stringValue = "25.5"
//    println(stringValue + 5) // 25.55
//    var stringConverted = stringValue.toDouble() + 5 // 25.5 + 5 = 30.5
//    println(stringConverted) // 30.5
//    println(stringValue)
//
//    println(intValue + stringConverted) // 130.5
//    println(intConverted + stringConverted) // 1 + 30.5 = 31.5


    // NEU: STRING-OPERATIONEN

    var string1 = "Hello World!"
    var string2 = "Planet!"

    //length
    var string1Length = string1.length
    var string2Length = string2.length
    println("Der 1. String ist $string1Length Zeichen lang, der 2. String ist $string2Length Zeichen lang.")

    // equals
    var areStringsEqual =  string1.equals(string2)
    println("It is $areStringsEqual that string1 and string2 are the same.")

    // contains
    var contains = string1.contains(string2)
    println("It is $contains that string1 contains string2.")


}








//
//    // Bonus: Funktionen für die, die schonmal schauen wollen
//    var meinAlter = rechneMeinAlterAus(2023,1999)
//    var deinAlter = rechneMeinAlterAus(2023,1986)
//    var meinHundAlter = rechneMeinAlterAus(2023, 2015)
//    println("Ich bin $meinAlter Jahre alt.")
//
//}
//
//fun rechneMeinAlterAus(x: Int, y: Int) {
//    // Funktionalität, in der aktuelles Jahr von Geburtsjahr abgezogen wird
//    println(x-y)
//}
