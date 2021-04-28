fun main () {
    var saldo : Int?

    saldo = getsaldo()
//var teste = saldo ?: 0
//println(teste)

saldo?.let {
    println(it)
}
}

fun getsaldo() : Int?{
    return null //se o valor for NULO - "NULL", ele nao retornará nada na exibicição, ficando em branco
              //se o valor for 0 ou qualquer outro numero, aparecerá o retorno normalmente( o valor )
              //se digitar algo que nao seja numero, o programa crasha

}
