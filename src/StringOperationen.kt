fun main() {



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
