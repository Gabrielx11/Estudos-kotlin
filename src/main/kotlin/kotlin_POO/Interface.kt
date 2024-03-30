interface  Selvagem{ //
    fun atacar(){
        println("O animal está preste a atacar")
    }
}
interface quatro_patas{
    fun locomocao(){
        println("O animal se locomove em 4 patas")
    }
}
abstract class Mamifero_2(var nome:String): Selvagem{  // O 'Mamifero não  herdou de 'Selvagem', porém foi implementado por essa Interface
    abstract fun habitat()
    abstract fun acordar()
    abstract fun fale()
    abstract fun alimentacao()
    fun tempo(){
        println("Tempo de vida do mamifero")
    }
}
class Dog_2(nome: String):mamifero(nome), Selvagem, quatro_patas{
    override fun acordar() {
        println("Cachorro está acordado")
    }

    override fun alimentacao() {
        println("Cachorro come ração")
    }

    override fun fale() {
        println("Au Au")
    }

    override fun habitat() {
        println("Casinha do cachorro")
    }

    override fun atacar() {
        println("O cachorro está atacando ")
    }

    override fun locomocao() {
        println("O cachorro se locomove em 4 patas ")
    }
}
fun main() {
    var d:Dog_2 = Dog_2("Cachorro")
    d.tempo()
    d.acordar()
    d.fale()
    d.habitat()
    d.alimentacao()
    d.atacar()
    d.locomocao()
}