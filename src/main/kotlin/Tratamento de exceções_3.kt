import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner
import kotlin.math.sqrt
fun ler_arquivo(){
    val arquivo = File("C:\\Users\\carpeado\\estudos-kotlin\\src\\main\\Controle e Tratamento de Dados\\Passo a passo.txt")
    try {
        Scanner(arquivo).use{l ->
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch (e: FileNotFoundException){
        println("Falha ao ler o arquivo")


    }
}

fun main() {
    ler_arquivo()


}