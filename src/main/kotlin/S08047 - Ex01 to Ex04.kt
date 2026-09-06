fun main() {
    var volume = 0
    var ballonsNum = 0
    while ((volume + 7) <= 2000) {
        volume = volume + 7
        ballonsNum++
    }
    println("The number of ballons to fill $volume liters the tank is $ballonsNum ballons.\n")

    var i = 0
    while (i <= 50) {
        if ((i % 3 == 0) && (i % 5 == 0))
            print("FizzBuzz ")
        else if (i % 3 == 0)
            print("Buzz ")
        else if (i % 5 == 0)
            print("Fizz ")
        else
            print("$i ")
        i++
    }

    println()
    var name = "My name is Julius."
    var j = 0

    while (j <= name.length - 1) {
        print(name[name.length - 1 - j])
        j++
    }

    print("\nPlease, insert a character combination: ")
    val textToVerify = readln().lowercase()
    var k = 0
    var countingX = 0
    var countingO = 0

    while (k <= textToVerify.length - 1) {
        if (textToVerify[k] == 'x')
            countingX++
        else if (textToVerify[k] == 'o')
            countingO++
        k++
    }
    if (countingX != countingO || countingX == 0 || countingO == 0)
        println(false)
    else
        println(true)









}