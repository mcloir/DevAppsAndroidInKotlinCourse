// Write a function capable for calculate the 3rd power of a number.
fun cube(number: Int): Int = number * number * number

fun main() {
    println("Please, insert a integer:")
    var number = readln().toInt()

    println("The cube of the number $number is %d.".format(cube(number)))
}