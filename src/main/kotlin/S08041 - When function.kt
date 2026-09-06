fun main() {

    val number = 10

    when (number) {
        1 -> {
            println("Value is 1")
        }
        2 -> {
            println("Value is 2")
        }
        in 3..8 -> {
            println("Between 3 and 8")
        }
        else -> {
            println("Wrong value")
        }
    }
}