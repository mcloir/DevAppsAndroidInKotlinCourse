fun months(value: Int): Int {
    val months = value * 12
    return months
}

fun days(months: Int): Int {
    val days = months * 30
    return days
}

fun hours(days: Int): Int {
    val hours = days * 24
    return hours
}

fun minutes(hours: Int): Int {
    val minutes = hours * 60
    return minutes
}

fun seconds(minutes: Int): Int {
    val seconds = minutes * 60
    return seconds
}

fun main() {
    println("This program transforms time data.")
    println("Transforming 2 years in:")
    val years = 2

    val months = months(years)
    val days = days(months)
    val hours = hours(days)
    val minutes = minutes(hours)
    val seconds = seconds(minutes)

    println("$years years have $months months.")
    println("$years years have $days days")
    println("$years years have $hours hours")
    println("$years years have $minutes minutes")
    println("$years years have $seconds seconds")
}