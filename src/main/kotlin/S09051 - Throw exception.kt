fun main() {
    try {
        division(10, 0)
    } catch (e: Exception) {
        println(e.message)
    }
}

fun division(num: Int, den: Int): Int {
    if (den == 0) {
        throw Exception("Denominator can't be zero")
    }
    return num / den
}