
import kotlin.ArithmeticException
import kotlin.IllegalArgumentException
import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 0
    try {
        val res = (numerador/denominador)
        println("Resultado da divisão $res")
    }catch (e: ArithmeticException){
        println("Erro: Não existe divisão por zero!")
    }
    // catch (e: ArithmeticException) { ... } --> Este é o bloco catch que captura a exceção ArithmeticException, que é lançada quando ocorre uma divisão por zero.
    val numero = -4.0
    try {
        val res2 = sqrt(numero)
        if (numero < 0) {
            throw IllegalArgumentException()
        }
        println("Resultado da radiciação $res2")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz de números negativos")
    }
//catch (e: IllegalArgumentException) { ... }: Este é outro bloco catch que captura a exceção IllegalArgumentException, que é lançada quando um argumento ilegal ou inadequado é passado para uma função.


    /*
    O comando try e catch em Kotlin é usado para lidar com exceções durante a execução do código.

    O código que pode potencialmente lançar uma exceção é colocado dentro do bloco 'TRY'.
    Se uma exceção ocorrer durante a execução do bloco 'TRY', o controle é transferido para o bloco 'CATCH' correspondente.
    O bloco 'CATCH' captura a exceção e executa um código de tratamento de exceção específico para lidar com ela.
    */
}