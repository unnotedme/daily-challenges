/*
challenge #0 - the famous "fizz buzz"
difficulty: easy

write a program that displays by console (with a print) the numbers from 1 to 100 (them included, with a line jump between each print), replacing the following:
- multiples of 3 per the world "fizz"
- multiples of 5 per the world "buzz"
- multiples of 3 and 5 per the world "fizz buzz"
*/

fun main() {
    for (index in 1..100) {
        val multipleOfThree = index % 3 == 0
        val multipleOfFive = index % 5 == 0
        if (multipleOfThree && multipleOfFive) {
            println("fizz buzz")
        } else if (multipleOfThree){
            println("fizz")
        } else if (multipleOfFive){
            println("buzz")
        } else {
            println(index)
        }
    }
}