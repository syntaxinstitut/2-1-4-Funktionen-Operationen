import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt
import kotlin.math.pow

// imports machen
fun main(){

    // sqrt - Wurzel ziehen

    println("Die Wurzel von 9 ist: ${sqrt(9.0).toInt()}")

    // sqrt Variante mit Variablen:
    var product = 49.0
    var root = sqrt(product)
    println("Die Wurzel von ${product.toInt()} ist ${root.toInt()}.")

    // min - Minimum von 2 Zahlen rausfinden
    var zahl1 = 99
    var zahl2 = 4
    var minimum = min(zahl1,zahl2)
    println("Das Minimum der 2 Zahlen $zahl1 und $zahl2 ist $minimum")

    // max - Maximum von 2 Zahlen rausfinden
    var maximum = max(zahl1,zahl2)
    println("Das Maximum der 2 Zahlen $zahl1 und $zahl2 ist $maximum")


    // pow - Potenz: eine Zahl hoch die andere rechnen
    var base = 7.0
    var potenz = 2
    var result = base.pow(potenz)
    println("${base.toInt()} hoch ${potenz} ist ${result.toInt()}.")

}