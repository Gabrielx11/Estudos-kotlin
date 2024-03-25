
import kotlin.ArithmeticException
import kotlin.IllegalArgumentException
import kotlin.math.sqrt
fun main() {
    try {
        var s:String? = null
        s = "Gabriel"
        println("O tamanho da String é: ${s!!.length}")

        var a = 10/0
        println("O resultado da divisão será $a")

        var b =-9.0
        var c = sqrt(b)
        if (b<0){
            throw  IllegalArgumentException()
        }
        var x = 1
        if (x==1){
            throw  Exception("O valor de X não pode ser 1")
        }
    }catch (e: NullPointerException){ // String
        println("A variável está vazia")
    }catch (e: ArithmeticException){ // Valor numérico
        println("Não existe divisão por zero")
    }catch (e: IllegalArgumentException){ //Argumento ilegal ou inadequado
        println("Não existe raiz de número negativo, sendo exclusibo para conjunto dos números complexos ")
    }catch (e: Exception){
        println("Exceção mais geral")
        println(e.message)
    }finally { //Será executado sempre ->  Usado para finalizar o a  ação
        println("Executando Finally, finalizando  o bloco de tratamento de dados")
    }
    println("Final do programa ...")
}