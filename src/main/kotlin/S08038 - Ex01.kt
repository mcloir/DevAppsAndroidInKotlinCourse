fun calculateBonus(option: Int) {
    if (option == 1)
        println("The Bonus for Managers is R$2.000,00")
    else if (option == 2)
        println("The Bonus for Coordinators is R$1.500,00")
    else if (option == 3)
        println("The Bonus for Engineers is R$1.000,00")
    else if (option == 4)
        println("The Bonus for Coordinators is R$500,00")
    else
        println("Wrong option.")
}

fun main() {
    println("Hello, let's calculate the workers' bonus:")
    println("Please insert the position of the worker:")
    println("    1 Manager\n    2 Coordinator\n    3 Engineer\n    4 Intern")
    val option = readln()
    calculateBonus(option.toInt())
}