fun calculateBonus1(option: Int) {
    if (option == 1) {
        println("Insert the elapsed time of work in years:")
        val timeElaspsed = readln().toInt()
        if (timeElaspsed < 2)
            println("The Bonus for Managers is R$2.000,00")
        else
            println("The Bonus for Managers is R$3.000,00")
    }
    else if (option == 2) {
        println("Insert the elapsed time of work in years:")
        val timeElaspsed = readln().toInt()
        if (timeElaspsed < 1)
            println("The Bonus for Managers is R$1.500,00")
        else
            println("The Bonus for Managers is R$2.000,00")
    }
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
    val option = readln().toInt()
    calculateBonus1(option)
}