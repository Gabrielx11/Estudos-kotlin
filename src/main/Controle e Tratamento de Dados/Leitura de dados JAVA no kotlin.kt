import java.util.Scanner

fun ler_int(){
    val scanner = Scanner(System.`in`)
    println("Digite um número inteiro: ")
    val num =scanner.nextInt() //Faz a leitura e diz a tipagem dela
    println("Você digitou: $num")
   // scanner.close() // Finaiza a leitura de dados
}
// No java não se usa o '.' mas sim a ',' para digitar o valor destas tipagens
fun ler_double() {  // utilizar virgula
    val scanner = Scanner(System.`in`)
    println("Digite um número Double: ")
    val num = scanner.nextDouble() //Faz a leitura e diz a tipagem dela
    println("Você digitou: $num")
}
fun ler_string() {
    val scanner = Scanner(System.`in`)
    println("Digite algo: ")
    val num = scanner.next() //Faz a leitura e diz a tipagem dela
    println("Você digitou: ${num}")
}
fun ler_float() {  // utilizar virgula
    val scanner = Scanner(System.`in`)
    println("Digite um número Float: ")
    val num = scanner.nextFloat() //Faz a leitura e diz a tipagem dela
    println("Você digitou: ${num}")
}
fun ler_boolan() {
    val scanner = Scanner(System.`in`)
    println("Digite um valor Booleano: ")
    val num = scanner.nextBoolean() //Faz a leitura e diz a tipagem dela
    println("Você digitou: ${num}")
}

fun main() {
    // Realizar a prática de leitura  de dados utilizando a Biblíoteca Scanner da linguagem JAVA.
    ler_int()
    ler_double()
    ler_string()
    ler_float()
    ler_boolan()
}