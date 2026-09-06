fun main() {
    var str: String? = null

    str?.lowercase()
    str?.length
    str?.contains("abc")

    // In this case, str? inside the let becames "it" and the let will run the commands only if the variable or value is not null.
    str?.let {
        println(it.lowercase())
        println(it.length)
        println(it.contains("abc"))

    }

    // As you can see, when the value of str changes, the let allows the codes to run.
    str = "abc"

    str?.let {
        println(it.lowercase())
        println(it.length)
        println(it.contains("abc"))

    }
}