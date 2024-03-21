
fun Impressao(){ //Função sem parâmetro e sem  retorno - VOID (Vazio)
    println("Função sem parâmetro e sem  retorno")
}
fun Soma(a:Int,b:Int):Int{ //Função com parâmetro e com retonro do tipo Inteiro
    return a+b
}
fun main() {
    Impressao()
    var x= 10
    var y= 30
    println(Soma(x,y))
    println(soma_2(x,y))
}
fun soma_2(a:Int,b:Int){ //Função com parâmetro e sem retorno
    println("A soma das variáveis são: ${a+b}" )

}
/*
Os parâmetros estão sendo declarados semelhante a como delarar os tipo de uma variável
e os Retornos são semelhante a declarar a ação que aquela funçao irá fazer.
EX:
     ---PARÂMETRO(Inteiro,Real,Booleano,String)---
       ----renurn a+b / null / true, false / println----
 */