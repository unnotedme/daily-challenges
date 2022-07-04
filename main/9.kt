/*
#9 - morse code
difficulty: medium

create a program that is capable of transforming natural text to morse code and vice versa.
- it should automatically detect what type it is and perform the conversion.
- in morse, dash "—", period ".", a space " " between letters or symbols and two spaces between words " " are supported.
- the supported morse alphabet will be the one shown in https://wikipedia.org/wiki/morse_code.
 */

fun main() {

    val naturalText = "hi. my name is ted!"
    val morseText = decoder(naturalText)
    println(morseText)
    println(decoder(morseText))
}

private fun decoder(input: String): String {

    var decodedInput = ""

    val naturalDict =
            mapOf(
                    "A" to ".—",
                    "N" to "—.",
                    "0" to "—————",
                    "B" to "—...",
                    "1" to ".————",
                    "C" to "—.—.",
                    "O" to "———",
                    "2" to "..———",
                    "CH" to "————",
                    "P" to ".——.",
                    "3" to "...——",
                    "D" to "—..",
                    "Q" to "——.—",
                    "4" to "....—",
                    "E" to ".",
                    "R" to ".—.",
                    "5" to ".....",
                    "F" to "..—.",
                    "S" to "...",
                    "6" to "—....",
                    "G" to "——.",
                    "T" to "—",
                    "7" to "——...",
                    "H" to "....",
                    "U" to "..—",
                    "8" to "———..",
                    "I" to "..",
                    "V" to "...—",
                    "9" to "————.",
                    "J" to ".———",
                    "W" to ".——",
                    "." to ".—.—.—",
                    "K" to "—.—",
                    "X" to "—..—",
                    "," to "——..——",
                    "L" to ".—..",
                    "Y" to "—.——",
                    "?" to "..——..",
                    "M" to "——",
                    "Z" to "——..",
                    "\"" to ".—..—.",
                    "/" to "—..—."
            )

    val morseDict = mutableMapOf<String, String>()
    naturalDict.forEach { morseDict[it.value] = it.key }

    if (input.contains("[a-zA-Z0-9]".toRegex())) {

        var index = 0
        var ch = false

        input.uppercase().forEach { character ->
            if (!ch && character.toString() != " ") {
                val nextIndex = index + 1
                if (character.toString() == "C" &&
                                nextIndex < input.length &&
                                input.uppercase()[nextIndex].toString() == "H"
                ) {
                    decodedInput += naturalDict["CH"]
                    ch = true
                } else {
                    decodedInput += naturalDict[character.toString()]
                }

                decodedInput += " "
            } else {
                if (!ch) {
                    decodedInput += " "
                }
                ch = false
            }

            index++
        }
    } else if (input.contains(".") || input.contains("—")) {

        input.split("  ").forEach { word ->
            word.split(" ").forEach { symbols ->
                if (symbols.isNotEmpty()) {
                    decodedInput += morseDict[symbols]
                }
            }
            decodedInput += " "
        }
    }

    return decodedInput
}
