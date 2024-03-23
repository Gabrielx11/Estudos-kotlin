fun main() {
    val linhas = 3
    val colunas = 6
        val matriz: Array<Array<Int>> = Array(linhas) { Array(colunas) { 0 } }
    var digito = -1
    for (i in 0 until linhas) { // until = de 0 até que seja menor que 3, então vai até o 2
        for (j in 0 until colunas){
            print("${matriz[i][j]} ")
        }
        println()
    }
    for (i in 0 until linhas){
        for (j in 0 until colunas){
             matriz[i][j] = ++digito
        }
    }
  /*  println("Impressão de matriz: ")     ---> primeira  maneira de inserir valor na matriz
    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            print("${matriz[i][j]} ")
        }
        println()
    } */
    println("Impressão de matriz: ")   // Segunda maneira
    for (linha in matriz){
        for (valor in linha){
            print("${valor} ")
        }
        println()
    }
    println("Quantidade de linhas na matriz: ${matriz.size}")
    println("Quantidade de colunas na matriz: ${matriz[0].size}")
}