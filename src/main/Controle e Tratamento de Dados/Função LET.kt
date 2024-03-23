fun main() {
    var str:String? = null
    str = "Gabriel" // Caso o STR não receba o valor, a variável será  nula
    // No código abaixo, será feita uma verificação. Caso STR seja diferente de NULL, irá imprimir a mensagem
        if (str != null){ // // Este bloco será executado se str não for nulo --> !=
            println("Caiu no  IF")
        }
    str?.let {
        println("Caiu na função LET")
    }
}