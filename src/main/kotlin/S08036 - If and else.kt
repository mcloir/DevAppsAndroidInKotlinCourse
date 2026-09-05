fun major(age: Int): Boolean {
    if (age >= 18) {
        return true
    }
    else {
        return false
    }
}
//This is another way to solve the same function.
fun majorAlt(age: Int): Boolean {
    return (age >= 18)
}

fun main() {
    major(15)

}