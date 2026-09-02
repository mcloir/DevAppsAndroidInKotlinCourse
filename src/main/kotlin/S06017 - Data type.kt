fun main() {

    // control + alt + l ajusts the code automaticly;

    var b: Boolean = false //could be true
    var str: String = "Hi"
    var c: Char = 'h' //it could be any character and you should use ''
    var double: Double = 10.3
    var float: Float = 10.1F //when you want to use float, you should use F after the number
    var integer: Int = 10
    var short: Short = -10
    var long: Long = 100L
    var byte: Byte = 1

    /*
   Inteiros sem casas decimais
        Byte: 8 bits (de -128 a 127).
            Short: 16 bits (de -32.768 a 32.767).
            Int: 32 bits (padrão para números inteiros).
            Long: 64 bits (exige o sufixo L, como 10000000000L).
            Ponto Flutuante (Com casas decimais):
            Float: 32 bits, precisão de 6 a 7 dígitos decimais (exige o sufixo f ou F, como 10.5f).
            Double: 64 bits, precisão de 15 a 16 dígitos decimais (padrão para decimais).

        Inteiros Sem Sinal (Unsigned Integers):
            UByte, UShort, UInt e ULong (utilizados quando apenas valores positivos são necessários).

        Caracteres e Texto
            Char: Armazena um único caractere delimitado por aspas simples (ex: 'A', '9').
            String: Representa uma sequência imutável de caracteres delimitada por aspas duplas (ex: "Olá, Kotlin"). Suporta interpolação de variáveis diretamente (ex: "Nome: $nome").

        Booleanos
            Boolean: Representa os valores lógicos de verdadeiro ou falso (true ou false).
             */

    println("${Double.MIN_VALUE} - ${Double.MAX_VALUE}")
    println("${Float.MIN_VALUE} - ${Float.MAX_VALUE}")
    println("${Long.MIN_VALUE} - ${Long.MAX_VALUE}")
    println("${Integer.MIN_VALUE} - ${Integer.MAX_VALUE}")
    println("${Short.MIN_VALUE} - ${Short.MAX_VALUE}")
    println("${Byte.MIN_VALUE} - ${Byte.MAX_VALUE}")
}

