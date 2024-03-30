/*
interface dev{                    --> FEITO COM INTERFACE
    var salario:Float
    fun bonus():Float

}
class mobile(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.7f
    }
}
class game(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario * 0.6f
    }
}
class back(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

*/

/*

    // SEM POLIMORFISMO
fun mostra_bonus(m:mobile){
    println(m.bonus())
}
fun mostra_bonus(g:game){
    println(g.bonus())
}
fun mostra_bonus(b:back){
    println(b.bonus())
}

 */


    // COM POLIMORFISMO
fun mostra_bonus(d:dev){
    println(d.bonus())
}

fun main() {
    mostra_bonus(back(1000f))
    mostra_bonus(game(1000f))
    mostra_bonus(mobile(1000f))

}

abstract class dev(var salario:Float){
    abstract fun bonus():Float

}
class mobile(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario*0.7f
    }
}
class game(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario * 0.6f
    }
}
class back(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario * 0.5f
    }
}
