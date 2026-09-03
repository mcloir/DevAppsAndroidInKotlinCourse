fun helloWorld(name: String) {
    println("Hello $name!")
}
fun helloWorld2(name: String) = println("Hello $name!")
//There is a same way to define the fuction when you have only one line inside.

fun avg(a: Float, b: Float): Float {
    var avg: Float = (a + b) / 2
    return avg
}

fun avg2(a: Float, b: Float): Float = (a + b) / 2

fun main() {
    helloWorld("Daniel")
    helloWorld2("Daniel")
    println(avg(1,3))
    println(avg2(a = 1F,3F))
}