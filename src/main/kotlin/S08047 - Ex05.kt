import kotlin.math.pow

fun futureValue(initialCapital: Double, tax: Double, period: Double, periodValue: Double): Double {
    var a = (1 + tax).pow(period)
    var futureV = initialCapital * a + periodValue * (a - 1) / (tax)
    return futureV
}

fun main() {

    var period = 1.0
    val initialCapital = 0.0
    val taxAna = 0.2 / 100
    val taxPaula = 0.8 / 100
    val periodValueAna = 10000.0 * 0.05 * 2
    val periodValuePaula = 10000.0 * 0.05

    var futureValueAna = futureValue(initialCapital, taxAna, period, periodValueAna)
    var futureValuePaula = futureValue(initialCapital, taxPaula, period, periodValuePaula)

    while (futureValuePaula < futureValueAna) {
        period++
        futureValueAna = futureValue(initialCapital, taxAna, period, periodValueAna)
        futureValuePaula = futureValue(initialCapital, taxPaula, period, periodValuePaula)
    }
    println("It is necessary $period months to the Paula's Capital (R$$futureValuePaula) overcomes Ana's Capital (R$$futureValueAna)")
}