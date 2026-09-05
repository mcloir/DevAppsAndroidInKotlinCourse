fun bonus(time: Int): Int {
    if (time <= 1) {
        return 500
    } else if (time > 1 && time <= 3) {
        return 2000
    } else {
        return 5000
    }
}

fun main() {
    val time = 10
    println("The bonus for $time year(s) is ${bonus(time)}.")
    println("daniel")
}