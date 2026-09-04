// Write a function to convert a temperature in Celsius to Fahrenheit.
fun celsiusToFahrenheit(temperature: Float): Float = (temperature * 9 / 5) + 32

fun main() {
    println("Please, inform the temperature in Celsius to convert to Fahrenheit:")

    // Trata a vírgula e lê o valor como float
    val tempInCelsius: Float = readln().replace(',', '.').toFloat()

    // Formata e exibe os valores
    println("The temperature of %.2f°C in Fahrenheit is %.2f°F.".format(tempInCelsius, celsiusToFahrenheit(tempInCelsius)))
}