class Pokemon(var nome:String){

    var atk:Int? = null
    constructor(nome: String, atk:Int) : this(nome){
        this.atk = atk //Permite receber valor 'atk' caso seja atribuido no 'S1'
    }
    fun AP(){
        println("Meu Pokemom é $nome e seu pode de ataque é $atk ")
    }
}

fun main() {
    var s1 = Pokemon("Pidgey", )
    var s2 = Pokemon("Charmander", 86)
    s1.AP()
    s2.AP()
}