enum class Prioridade{
    Baixa, Media, Alta
}
enum class Prioridade_2(val v:Int){
    B(1), M(7), A(10)
}
enum class Prioridade_3(val value:Int){
    A(10){
        override fun toString(): String { // override -> Sobescreve uma função herdada de uma CLASS (No caso deste exemplo,a 'toString')
            return "Prioridade Alta com o valor $value"
        }
    },
    M(6){
        override fun toString(): String {
            return "Prioridade Media com o valor $value"
        }
    },
    B(1){
        override fun toString(): String {
            return "Prioridade Baixa com o valor $value"
        }
    }
}
enum class Animal{
    Gato, Cachorro, Tucano, Papagaio, Leopardo
}
fun x(p:Prioridade){

}
fun main() {
    // Forma de acessar um valor  de uma classe do tipo  Enum.
    x(Prioridade.Alta)
    x(Prioridade.Media)
    x(Prioridade.Baixa)

    for (p in Prioridade.entries){
        print("$p ")
    }
    println()
    for (p in Animal.values()) {
        print("$p ")
    }
    println()
    for (p in Prioridade_2.values()) {
        print("${p.v} ")
    }
    println()
    for (p in Prioridade_3.entries) {
        println("${p } ")
    }
}