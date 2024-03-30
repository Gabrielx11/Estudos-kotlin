abstract class mamifero(var nome:String){  // Classe abstrata serve  somente para passar a sua herança a outras classes .
    abstract fun habitat()
    abstract fun acordar()
    abstract fun fale()
    abstract fun alimentacao()
    fun tempo(){
        println("Tempo de vida do mamifero")
    }
}
class dog(nome: String):mamifero(nome){
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
}
fun main() {
    var d:dog = dog("Cachorro")
    d.tempo()
    d.acordar()
    d.fale()
    d.habitat()
    d.alimentacao()
}