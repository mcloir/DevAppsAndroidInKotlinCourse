fun main() {

    println("Crescent order")
    for (i in 1..50) {
        print("$i ")
    }

    println("\nDecrescent order")
    for (i in 50 downTo 1) {
        print("$i ")
    }

    println("\nCrescent order without 5's multiples")
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        else
            print("$i ")
    }

    println("\nCrescent order with 5's multiples")
    for (i in 1..50) {
        if (i % 5 == 0) {
            print("$i ")
        }
        else
            continue
    }

    println("\nCalculating the sum of the sequence from 1 up to 500:")
    var sum = 0
    for (i in 1..500) {
        sum = sum + i
    }
    println("\nThe sum is $sum.")
}