fun main() {
    var i=0
        while(i<1000) {
            if (i == 20) {
                break // Para uma interação com base em uma requisição lógica.
            }
            print("${i} ")
            i++
        }
    print('\n')
    var str = "Teste de Perfil"
    var j=0 // Um Arrey sempre se inicia  pela posição  0.  J -> Declarada  para começar pelo inicio da frase / 0
        while (j < str.length){
            if (str[j] == 'p'){
                break  //Irá parar na posição onde fica a letra P
            }
            print("${str[j]} ") // A variável está  em [j], pois foi declarada a posição 0, por isso quando ela é posta desta maneira, significa que  começará do inicio
            j++
        }
    print('\n')
    for (i in 0 .. 20) {
        if (i % 2 == 0) {
            continue // Irá continuar
        }
        print("${i} ")
    }
    print('\n')
    var str2 = "Teste de Perfil"
    for(i  in 0 ..(str2.length-1)){
        if (str2[i] == 'e' || str2[i] == 'i'){    //  Pular as letras E e I
            continue // Irá continuar
        }
        print("${str2[i]} ")
    }
}