fun main() {
    // Estrutura de Decisão 'IF ELSE'

    var idade:Int = 18
    if (idade >=18) {
        println("Maior de idade")
    }else {
        println("Menor de idade")
    }
    //Iniciando uma condição após o 'else'  --> Exercicio:

    var Idade:Int = 1
    if (Idade >= 60) {
        println("Sua Classificação de idade é idoso")
    }else if(Idade <= 59 && Idade >= 21){
        println("Sua Classificação de idade é Adulto")
    }else if(Idade <= 20 && Idade >= 13){
        println("Sua Classificação de idade é Jovem")
    }else {
        println("Sua Classificação de idade é Criança")
    }
}