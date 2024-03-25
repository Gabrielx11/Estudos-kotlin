fun main() {
    //Any, Unit e Nothing
    a(10)
    b()
    c()
}

fun a(valor: Any){  //Aceita qualquer tipagem
    println("Imprimindo o valor: $valor")
}
fun b():Unit{
    println("Função sem retorno (VOID)")
}
fun c():Nothing{ // Geralmente usada para planejar e deixar reservado  para uma futura alteração
    TODO("Função ainda a ser completada")
}