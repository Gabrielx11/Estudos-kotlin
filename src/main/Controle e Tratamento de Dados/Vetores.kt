fun vetor_inteiros(){ // Mesmo tendo 10 elementos, o indece (i) começa a partir do 0, ou seja, 0 a 9
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in 0..(numeros.size-1)){
        print("${numeros[i]} ")
    }
    print("\n")
println("Acessando a nona posição: ${numeros[9]}")
}
fun vetor_inteiros2(){ //Outra ma
    var n = Array(10,{i->i})
    for (i in n){
        print("${n[i]} ")
    }
    print("\n")
}
fun vetor_bool(){
    var a = booleanArrayOf(true,false,true,false,false,true,true)
    for (i in 0..(a.size-1)){
        print("${a[i]} ")
    }
    print("\n")
}
fun vetor_str(){
    var s = arrayOf("Fortaleza", "Eusébio", "Aquiraz")
    for (i in 0..(s.size-1)){
        print("${s[i]} ")
    }
    print("\n")
    println("Acessando o primeiro elemento: ${s[0]}")
}
fun vetor_char(){
    var c = charArrayOf('L','G','Y','R','M','A')
    for (i in 0.. (c.size-1)){
        print("${c[i]} ")
    }
    print("\n")
    println("Acessando a posição 3 que está a letra: ${c[3]}")
}
fun vetor_float(){
    var f = floatArrayOf(1.35f,6.30f,6.60f,129.99f,50.70f,444.13f,999.99f)
    for (i in 0..(f.size-1)){
        print("${f[i]} ")
    }
    print("\n")
    println("Acessando o elemeto 3 que está o valor: ${f[3]}")
}
fun main() {
    vetor_inteiros()
    vetor_inteiros2()
    vetor_bool()
    vetor_str()
    vetor_char()
    vetor_float()
}