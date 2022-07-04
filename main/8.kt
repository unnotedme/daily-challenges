/*
#8 - decimal to binary
difficulty:easy

create a program that is responsible for transforming a decimal number to binary without using the language's own functions that do it directly.
*/

fun main() {
    println(decimalToBinary(632))
    println(decimalToBinary(0))
}

fun decimalToBinary(decimal: Int): String {

    var number = decimal
    var binary = ""

    while (number != 0) {

        val reminder = number % 2
        number /= 2

        binary = "$reminder$binary"
    }

    return binary.ifEmpty { "0" }
}