fun main() {
    val language = "Kotlin"
    val characteristics = "is amazing"
    println(language)
    println(language + characteristics)
    println(language + " " + characteristics) //correcting the lack of space between Kotlin and is
    println("$language $characteristics")
    //println("$Double.MAX_VALUE") // error by the lack of {}
    println("${Double.MAX_VALUE}")



}