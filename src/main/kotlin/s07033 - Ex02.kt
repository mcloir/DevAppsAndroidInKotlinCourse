// Write a function able to receive a string and return the total of characters.

fun countingChar(string: String): Int = string.length

fun main() {
    val string: String
    string = "This is the string."

    println("The total of characters in '$string' are %d.".format(countingChar(string)))
}