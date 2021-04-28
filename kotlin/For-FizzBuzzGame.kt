// Numeros Divisiveis por 15 = FizzBuzz
// Numeros Divisiveis por 3 = Fizz
// Numeros Divisiveis por 5 = Buzz
// Caso Contrário = Imprime o número

fun main () {
    for (numero in 1..100) {
        println(fizzBuzz(numero))
    }
}
fun fizzBuzz(numero: Int) = when {
    numero % 15 == 0 -> "FizzBuzz"
    numero % 3 == 0 -> "Fizz"
    numero % 5 == 0 -> "Buzz"
    else -> "$numero"

}