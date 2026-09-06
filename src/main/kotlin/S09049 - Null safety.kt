fun main() {
    // null safety

    val str: String? = null // o ? is the way to define de null value

    println(str?.length) // putting a ? after de value or variable, is a way to treating the null problem.
    println(str!!.length) // putting !! after the value of variable, is a way to say that it will never have null value.

    val abc = readln()
    if (abc != null) {
        abc.toShort()
    }
    else {
        println("Insert a valid value.")
    }
}