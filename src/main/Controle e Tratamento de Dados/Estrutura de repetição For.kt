fun main() {
    for(i in 1..10){ // Estrutura de repetição FOR crescente de 1 em 1
        println("$i Hello World")
    }
    println("\n") //Quebra de linha
    for(i in 20 downTo 1){ // Estrutura de repetição FOR decrescente de 1 em 1
        println("$i Hello World")
    }
    println("\n")
    val str = "Criação  de aplicativos android"
    for( i in str){
        println("$i")
    }
    println("\n")
    for(i in 1..20 step 2){ // Estrutura de repetição FOR crescente de 2 em 2
        println("$i")
    }
    println("\n")
    for(i in 20 downTo 1 step 3) { // Estrutura de repetição FOR decrescente de 3 em 3
        println("$i")
    }
}