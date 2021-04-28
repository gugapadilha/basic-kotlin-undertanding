//Crie um programa que calcule e exiba o resultado da media de temperatura informadas pelo usuario.

fun main (){
    var temperatura: Int
    var somatorio: Int = 0
    var quantidade: Int = 0

    do {
        println("Digite uma temperatura ou 999 para sair:")
        temperatura = readLine()!!.toInt()


        if (temperatura != 999) {
            somatorio += temperatura //somatorio = somatorio + temperatura  A
            quantidade++ //quantidade = quantidade +1
        }
    } while (temperatura != 999)

    println("A media das temperaturas é = ${somatorio/quantidade}")
}

//readLine() -> RECEBER UM VALOR QUE O USUARIO DIGITOU VIA LINHA DE COMANDO