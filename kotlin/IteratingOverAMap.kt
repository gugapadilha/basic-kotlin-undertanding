import java.util.*

//Imprimir as representacoes binarios dos caracteres  de A a E

fun main() {

    val binaryRepresentation = TreeMap<Char, String>()

    for (c in 'A'..'E') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepresentation[c] = binary
    }

    for ((letter, binary) in binaryRepresentation) {
        println("$binary")
    }


}
