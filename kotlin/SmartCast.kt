import java.lang.IllegalArgumentException

fun main (){
// ((1 + 2) + 4) O CODIGO FOI CRIADO PARA RESOLVER ESSA CONTA SEM ESTAR EXPLÍCITA
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}

interface Expressao
class Numero(val valor: Int) : Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao) : Expressao

fun avaliacao(expressao: Expressao): Int {
    if (expressao is Numero) {
        return expressao.valor //não preciso colocar que o numero é igual a uma expressao
    }                          //e que é um Numero, o Kotlin detecta sozinho e ja sabe que é uma expressao

    if (expressao is Soma) {
        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)

    }

    throw IllegalArgumentException ("Expressao é desconhecida")  // <-- mostrando uma excessao
}