fun main () {
    var hora = 22
    println("Agora são exatamente ${hora} horas.")
    if (hora < 12) {
        println("Bom dia!")
    } else if (hora <= 18) {
        println(" Boa tarde!")
    }
    else {
        println("Boa noite!")
    }
}