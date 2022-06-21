/*
#2 - the fibonacci sequence
difficulty: difficult

write a program that prints the first 50 numbers of the fibonacci sequence starting at 0.
th fibonacci sequence is composed of a sequence of numbers in which the following number is always the sum of the two previous ones.
*/

import java.math.BigInteger

fun main() {
    val totalNumbersPrinted = 50
    var s1 = 0
    var s2 = 1

    print("first $totalNumbersPrinted terms: ")

    for (i in 1..totalNumbersPrinted) {
        print("$s1 + ")

        val sum = s1 + s2
        s1 = s2
        s2 = sum
    }
    
}