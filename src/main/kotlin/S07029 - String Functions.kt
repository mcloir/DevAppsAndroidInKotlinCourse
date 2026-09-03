fun main() {
    val str = "I'm trying to learn Kotlin"

    println(str[0]) //Return the first position from the variable str
    println(str.length) //Return the length from the variable str
    println(str.startsWith("I'm")) //Return true or false depending the match of the prefix with de var str
    println(str.endsWith("Daniel")) //Return true of false matching the end of the variable.
    println(str.substring(5)) //Return the value of string from the 5th position
    println(str.substring(5, 9)) //Return the range of values by 5th up to 9th.
    println(str.replace("I", "Z")) //Replaces the old char to the new char
    println(str.uppercase())
    println(str.lowercase())
    println(str.contains("learn")) //Return true of false depending the term inside the funtion.
    println(str.isEmpty())
    println("    asçldktroagisdaj          ".trim()) //Cuts off the spaces before and after the characters
}