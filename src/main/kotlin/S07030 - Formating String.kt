import java.util.Locale

fun main() {
    val name = "Daniel"
    println("Hello my friend $name")

    println("Hello %s".format(name))

    /*
    %s is a placeholder, it is useful to reserve position for values.
    %s for strings
    %d for integers
    %f for float
    %c for char
    %b for boolean
     */

    val value = 5
    val salary = 1234.12

    println("Value: %d - Salary: %f".format(value, salary))
    println("Value: %2d - Salary: %.2f".format(value, salary))
    println("Value: %02d - Salary: %.2f".format(Locale.FRENCH, value, salary))



}