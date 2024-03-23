fun main() {
    var i = 0
    do {
        print("${i}")
        i++
    }while (i <= 10)

    while (i==10) {
        println("Loop While")
        i++
    }
    println("\n")
    do {
        println("Qual é o seu nome: ")
        val value = readLine() // Cria um loop até que  usuário escreva algo
    }while (value == "")
}