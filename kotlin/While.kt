//Crie um programa que calcule e exiba o resultado da media de temperatura informadas pelo usuario.

fun main (){
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while (temperatura != 999) {
        println("Digite uma temperatura ou 999 para sair: ")
        temperatura = readLine()!!.toInt() // <- esse ".toInt()" serviu para burlar o programa,pois o readLine()
                                           // só retornou um valor do tipo "String" ou "Null", e a TEMPERATURA
                                           // esperava receber um valor INTEIRO. Caso o usuario digitar alguma
                                           // letra, o programa CRASHA!
        if (temperatura != 999) {
            somatorio += temperatura //somatorio = somatorio + temperatura
            quantidade ++ //quantidade = quantidade +1
        }
    }
    println("A media das temperaturas é = ${somatorio/quantidade}")
}

//readLine() -> RECEBER UM VALOR QUE O USUARIO DIGITOU VIA LINHA DE COMANDO