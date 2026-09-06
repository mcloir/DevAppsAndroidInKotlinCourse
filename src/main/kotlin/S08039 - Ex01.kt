fun ageLimit(age:Int) {
    if(age < 18) {
       return println("You are not allowed because you are under 18.")
    }
}

fun invitePermit(invite: String) {
    if (invite != "1" && invite != "2" && invite !="3")
        return println("Invalid option")
    else {
        println("Inform your invite code:")
        val inviteCode = readln().uppercase()
        if (inviteCode == "XL" || inviteCode == "XT")
            println("Welcome")
        else
            return println("Access denied")
    }
}

fun main() {
    println("Inform your age:")
    val age = readln().toInt()
    ageLimit(age)

    println("Inform your invite type: \n 1 Standard\n 2 Premium\n 3 Lux")
    val invite = readln()
    invitePermit(invite)


}
