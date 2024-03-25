fun main() {
    /* O operador de acesso seguro '?.' é usado para lidar com o caso em que 'readLine()' pode
     retornar null, em situação onde o usuário pressionasse 'Enter' sem digitar nada. */

    // readLine =  solicita ao usuário que insira um valor através do teclado. O valor digitado é armazenado na variável 'n'

    //O operador elvis '?:' é usado para fornecer um valor padrão (0 neste caso) se a conversão para inteiro falhar ou se a entrada for nula.

    val n = readLine()
    var num = readLine()?.toInt() ?: 0 // toInt = Esta função converte a string lida para um número inteiro.
    var num2 = readlnOrNull()?.toInt() ?: 0
    var num3 = readlnOrNull()?.toDouble() ?: 0.0
    var num4 = readlnOrNull()?.toFloat() ?: 0.0f
    var num5 = readlnOrNull()?.toBoolean() ?: false
    println("Tipo String $n")
    println("Tipo Int $num")
    println("Tipo Int $num2")
    println("Tipo Double $num3")
    println("Tipo Float $num4")
    println("Tipo Boolean $num5")

}