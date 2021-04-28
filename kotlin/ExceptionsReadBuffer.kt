import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun main () {
    val idade = lerIdade()
    println(idade)
}

 fun lerIdade(): Int? {
    val reader = FileReader(File("src/main/kotlin/idades.txt"))
    val buffer = BufferedReader(reader)

     try {
         val numero = buffer.readLine()
         return Integer.parseInt(numero)
     }catch (e: NumberFormatException) {
         return null
     }
}

