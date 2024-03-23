fun main() {

    /*
    No Kotlin, por padrão, todas as variáveis devem ser inicializadas e não podem ter valores nulos, a menos que você especifique
    explicitamente que elas podem ser nulas adicionando '?' ao tipo da variável. Por exemplo 'String?'
    */
    var str: String? = null
    println(str?.length) // Kotlin identifica e assume o tratamento do erro
    //str = "Testando minha String"
    println(str!!.length)//  Assume que posteriomente essa variavel séra usada em algum momento
    println("Testanto meu código")

}