fun main (){
    println(max(10, 5))
}
//Corpo de Bloco
fun max(a: Int, b: Int): Int{
    return if (a > b) a else b

}

//Corpo de expressão
fun max1(a: Int, b: Int): Int = if (a > b) a else b