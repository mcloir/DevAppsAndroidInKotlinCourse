//Write a function capable to receive miles and convert to km

fun milesToKm(): Double {
    println("Please, insert the number of miles:")
    var miles: Float = readln().toFloat()
    return miles * 1.6
}

fun main() {
    println("The program converts miles to km.")
    var km = milesToKm()

    println("The result is $km km.")
}