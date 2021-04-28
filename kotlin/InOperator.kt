fun main() {

    println(isLetter('7'))

    println(isNotDigit('x'))
}

fun isLetter(c :Char) = c in 'a'..'z' || c in 'A'..'Z' // esses || significa "OU"

fun isNotDigit(c :Char) = c !in '0'..'9' //o !in significa a negação