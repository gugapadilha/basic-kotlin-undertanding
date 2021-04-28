fun main () {
    var idade =75
    println(" voce tem ${idade}")
    if (idade < 18) {
        println("nao vota")
    } else if (idade >= 16 && idade < 18 || idade > 65) {
        println("voto opcional")
    } else  { //ja que é a ultima opcao nao precisa usar o }else if, apenas o ELSE
        println("Voto obrigatorio")
    }
}