class Animal_(var especie:String){
    var fala: String = ""
    /*
    '.lowercase()' converte o conteúdo da variável 'especie' para minúsculas antes de compará-la com as strings "cachorro" e "gato".
    Isso significa que não importa se o usuário digita "Cachorro", "CACHORRO", "CaCHorro", ou qualquer outra combinação de maiúsculas
    e minúsculas, a comparação será realizada em minúsculas.
    */
    init {
        fala = if (especie.lowercase() == "cachorro"){
            "auau"
        }else if (especie.lowercase() == "gato"){
            "miaumiau"
        }else{
            ""
        }
    /*
    O bloco 'init' é usado como um bloco de inicialização primária em uma classe. Ele é executado imediatamente após a construção
    de uma instância da classe, antes de qualquer outro código na classe ser executado.
    */
    }
    init {
        println(fala)
    }
    fun falar(){
        println(fala)
    }
}

fun main() {         // Três maneiras de iniciar código
    val animal = Animal_("Cachorro")   // Pela Variável
    Animal_("Cachorro").falar()       // Pela Função
    Animal_("Gato").fala             // Pelo Init
}