fun main() {
    val linhas = 6
    val colunas = 4
    val matriz: Array<Array<Char>> = Array(linhas) { Array(colunas) {'a'} }
    var c: Char = 'a'
     for (i in 0 until linhas){
         for (j in 0 until colunas){
             matriz[i][j] = c
             c++
         }
     }
    println("Matriz: ")      // Primeira maneira de imprimir a matriz
    for (i in 0 until linhas){
        for (j in 0 until colunas){
            print("${matriz[i][j]} ")
        }
        println()
    }
    println("--------------------") // Segunda maneira de imprimir a matriz
    for (linha  in matriz){
        for (valor in linha){
            print("${valor} ")
        }
        println()
    }
}