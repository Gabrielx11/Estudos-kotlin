fun main() {
    var str:String? = null
    str = "Gabriel"
    if (str == null){
        println("Variável mula")
    }else{
        println(str)
    }
    // Operador Elvis ?: --> Condicional feito na própria linha
    println(str ?: "nula") // Operador Elvis - Lembra o operador ternário

    var n1:Int? = null
     //n1 = 21
    if (n1 == null){
        println("Nulo")
    }else{
        println(n1)
    }
    println(n1 ?: "${n1}, está Nulo")
    println(n1 ?: "N1 está Nulo")
}