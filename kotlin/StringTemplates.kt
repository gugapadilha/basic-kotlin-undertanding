fun main (){
    val nome: String = "Guga"

    //println("Hello" + nome + "!") <- (MAIS COMPLICADO)
    println ("Hello $nome!") //<- Maneira Simplificada

    println(" A Soma é: ${soma(10, 20)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}