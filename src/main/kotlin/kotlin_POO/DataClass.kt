fun main() {
    var ret: Retangulo = Retangulo(10,20)
    var ret2: Retangulo = Retangulo(10,20)
// Equals, toString, hashCode  -> todos os objetos vem  por padrão esta  class
    println(ret.equals(ret2))
    // Variaveís ->  endereço de memoria

    var ret3: RetanguloData = RetanguloData(10,20)
    var ret4: RetanguloData = RetanguloData(10,20)
    println(ret3.equals(ret4))

    var ret5: RetanguloData = RetanguloData(10,20)
    ret5 = ret4.copy()  // Copia dos valores de uma variavel para outra
    println(ret5.toString())
}

class Retangulo(a:Int, b:Int){
    /*
    override fun equals(other: Any?): Boolean {
        return if (other is Retangulo){
            (other.a == this.a && other.b == this.b)
        }else{
            false
        }
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }

     */
}


data class RetanguloData(var a:Int, var b:Int){}

data class informaçoes(val rua:String, val num:Int, val bairro:String,val CEP:Int, val cidade:String){}
fun  endereco(e:informaçoes){

}
