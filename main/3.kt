/*
#3 - is it a prime number?
difficulty: medium

write a program that is responsible for checking if a number is prime or not.
once done, print the prime numbers between 1 to 100.
*/

fun main() {
    (1..100).forEach { number ->
        if (isPrime(number)) {
            println(number)
        }
    }
}

private fun isPrime(number: Int): Boolean {
    for (i in 2..number / 2) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}
