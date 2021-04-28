fun main () {

    Compras.lista.add("Arroz")
    Compras.lista.add("Feijao")
    Compras.lista.add("Batata")

    println(Compras.lista)

}

object Compras {

    var lista = mutableListOf<String>()
}