fun main () {
    /* ----------------------------------------- */
    /*           COMO CRIAR COLECOES             */
    /* ----------------------------------------- */

    //ArrayList - Classe
    val frutas1 = ArrayList<String>()
    frutas1.add("Maça")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    //ArrayList - Funcao
    val frutas2  = arrayListOf("Maça", "Banana", "Morango")
    //println(frutas2)

    /* ----------------------------------------- */
    /*           BIBLIOTECA PADRAO JAVA          */
    /* ----------------------------------------- */

    //Vamos confirmar que de fato as colecoes sao da biblioteca
    //Java Padrao
    println(HashSet::class.java)

    //Podemos tirar muito mais proveito das colecoes em Kotlin

    println(frutas2.last())

    val numeros = setOf(1, 14, 2)
    println(numeros.max())
}