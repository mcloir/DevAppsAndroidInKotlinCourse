fun main() {

    val str: String? = null
    val abc = "cçsalkj1"
    //println(str!!.length)


    try {
        println(abc[100]) // IndexOutOfBoundsException
    } catch (e: IndexOutOfBoundsException) {
        println("Erro - Index")
    }
    try {
        println(10 / 0)
    } catch (e: ArithmeticException) {
        println("Impossible division")
    }

    try {
        println(abc[100]) // IndexOutOfBoundsException
        println(10 / 0)
    } catch (e: IndexOutOfBoundsException) {
        println("Erro - Index")
    } catch (e: ArithmeticException) {
        println("Impossible division")
    } catch (e: Exception) {//This type the exception treats all types of problems and must be placed on the botton of catches.
        //logic
    } finally {
        println("This Finally code always is executed.")
    }
//It is possible to merge the codes and apply how many catchs you want to treat the try.



    //println(10 / 0) // Arithmetic Exception
    //println(abc[100]) // IndexOutOfBoundsException


}