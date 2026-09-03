fun main() {

    val str = "14"
    val str2 = "abc"
    val str3 = "true"

    val a: Byte = 0
    val b: Short = 5
    val c: Int = 10
    val d: Long = 14L
    val e: Float = 20F
    val f: Double = 28.0

    str.toByte()
    str.toShort()
    str.toInt()
    println(str.toLong())
    //println(str2.toLong()) it causes an exception.
    str.toFloat()
    str.toDouble()
    str.toBoolean()
    println(str3.toBoolean())

    a.toDouble()
    println(a.toDouble())
    a.toString()
    println(a.toString())

    //str.toInt() converts the val str to Int.

}