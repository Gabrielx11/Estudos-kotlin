fun casa(){
    println("Entrando na casa...")
    quarto()
}
fun quarto(){
    println("Entrando no Quarto...")
    guarda_roupa()
}
fun guarda_roupa(){
    println("Entrando no Guarda roupa...")
    sapato()
}
fun sapato(){
    println("Escolhendo o Sapato...")
    cadarco()
}
fun cadarco(){
    println("Escolhendo a cor do cadarço...")

}
fun main() { // Para ser referenciada pelo programa a relação maior "casa" terá que ser chamada pela Função principal (Main)
    casa()
}