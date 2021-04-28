fun main () {
    val pessoa1: Pessoa = Pessoa("Guga", 18)
    val pessoa2: Pessoa = Pessoa("Yoda", 27)


    println("Pessoa 1: ${pessoa1.nome + pessoa1.idade }")
    println("Pessoa 2: ${pessoa2.nome + pessoa2.idade }")
}

class Pessoa(
   val nome: String,
   val idade: Int
)