fun main(){
    // Bonus: Funktionen für die, die schonmal schauen wollen
    var meinAlter = rechneMeinAlterAus(2023,1999)
    var deinAlter = rechneMeinAlterAus(2023,1986)
    var meinHundAlter = rechneMeinAlterAus(2023, 2015)
    println("Ich bin $meinAlter Jahre alt.")

}


fun rechneMeinAlterAus(x: Int, y: Int) {
    // Funktionalität, in der aktuelles Jahr von Geburtsjahr abgezogen wird
    println(x-y)
}