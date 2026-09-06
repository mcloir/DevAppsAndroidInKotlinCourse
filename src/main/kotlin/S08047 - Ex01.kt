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

}