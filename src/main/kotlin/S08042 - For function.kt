fun main() {
    for (i in 1..10) {
        print("$i ")
    }
    print("\n")
    for (i in 1..100 step 3) {
        print("$i ")
    }
    print("\n")

    print("\n")
    for (i in 100 downTo 0 step 5) {
        print("$i ")
    }
    print("\n")

    val str = "Oasis is the best band in the world"
    for (j in str) {
        print(j)
    }

    print("\n")

    for (i in 1..10) {
        if (i == 5) {
            break
        }
        print("$i ")
    }
    print("\n")

    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        print("$i ")
    }

    for (i in 1..14) {
        for (j in 1..5) {
            print("$j ")
        }
        println()
        print("$i - ")
    }
}