fun main() {
    // Estrutura de Decisão 'WHEN'
    // Analisa  as opções e seleciona

    var cargo:String = "Estagiário"
    when(cargo) {
        "Presidente" -> println(6000f)
        "Gerente" -> println(4500f)
        "Coordenador" -> println(3200f)
        "Analista" -> println(2200f)
        "Estagiário" -> println(1500f)
    }
}