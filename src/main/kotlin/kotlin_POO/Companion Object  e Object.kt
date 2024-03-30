class Matematica(){
    //Escopo Classe e escopo objeto
    companion object M{  //Escopo CLasse
        val PI = 3.1415
        fun adc(){

        }
        init {
            println("Iniciando companion")
        }
    }
    object objt01{
        val  bronze = 0.03
        val PI = 3.1415
        fun adc(){}
        init {
            println("Iniciando objeto 01")
        }
    }
    object objt02{
        val prata = 1.61f
        val PI = 3.1415
        fun adc(){}
        init {
            println("Iniciando objeto 02")
        }
    }
    object objt03{
        val dourado = 8
        val PI = 3.1415
        fun adc(){}
        init {
            println("Iniciando objeto 03")
        }
    }
}
fun main() {
    //println(Matematica.PI)
    //Matematica.adc()
    var n:Matematica = Matematica()
    println("Acessando objeto 01 ${Matematica.objt01.bronze}")
    println("Acessando objeto 02 ${Matematica.objt02.prata}")
    println("Acessando objeto 03 ${Matematica.objt03.dourado}")
    Matematica.PI // Companion
    Matematica.PI // objt 01
    Matematica.PI // objt 02
    Matematica.PI // obgt 03
    Matematica.PI // não imprime
    Matematica.PI // não imprime

}