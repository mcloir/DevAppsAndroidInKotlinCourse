fun main() {
    val str: String? = null

    // Part1 (if it was null ?: Part 2 (this part assumes the value).
    if (str == null) {
        println("Nulo")
    }
    else {
        println(str)
    }

    //This line above are the same of this codes bellow:
    println(str ?: "Nulo") // if str is not null, do str, in other hand, if is null, do "Null").
}