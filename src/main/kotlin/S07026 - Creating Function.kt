fun helloWorld() {
    println("Hello My Friend")
}

fun hello2(name: String) {
    println("Hello $name")
}

fun avg(num: Int, num2: Int): Int {
    val avg = (num + num2) / 2
    return avg
}

fun main() {
    helloWorld()
    hello2("Daniel")
    println(avg(10, 4))
}