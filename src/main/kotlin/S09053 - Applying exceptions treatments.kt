fun reading(): Int {
    while (true) {
        val input = readln()
        if (input != null) {
            try {
                val number = input.toInt()
                if (number >= 0) {
                    return number
                } else
                    println("Insert a positive number.")
            } catch (e: Exception) {
                println("Insert a valid value: ")
            }
        } else
            println("Inform a valid value.")
    }
}


fun verifySquare() {
    println("Side 1:")
    val side1 = reading()

    println("Side 2:")
    val side2 = reading()

    if (side1 == side2)
        println("It is a square.")
    else
        println("It is not a square.")
}

fun main() {
    verifySquare()
}

