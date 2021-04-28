fun main (){
    val mnemonica = obterMnemonica(Cor.VERMELHO)
    println(mnemonica)

    val temperatura = obterTemperatura(Cor.VERDE)
    println(temperatura)
}

fun obterTemperatura (cor: Cor): String { //SEMPRE QUE USAR O "RETURN", OBRIGATORIAMENTE
    return when (cor) {                   //TEM QUE INFORMAR O TIPO E VALOR DO RETORNO!
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.AZUL -> "Frio"
        Cor.VERDE -> "Neutro"
    }
}
fun obterMnemonica(cor: Cor) =
    when (cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguem"
        Cor.VERDE -> "Viver"
        Cor.AZUL ->  "Alem é"
        Cor.LARANJA -> "Legal"
    }