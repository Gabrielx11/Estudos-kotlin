class  Pessoa_(val ano_nas:Int, var nome:String){
    var idade = 2023 - ano_nas
        fun  saudacao(){
            println("Seja bem vindo(a) ${this.nome}")
/* A palavra-chave 'this' é usada para acessar o atributo 'nome' da instância atual da classe 'Pessoa'.
 Isso permite que o método 'saudacao()' imprima o nome da pessoa que está chamando o método. Sem a palavra-chave
  'this', o código acima não funcionaria, pois o compilador não saberia qual instância da
 classe 'Pessoa' está sendo referenciada.*/
        }
    fun acorda(x: Boolean = true){
        if (x == true){
            println("O ${this.nome} está acordado")
        }else{
            println("O ${this.nome} está dormindo")
        }
    }
}
fun main() {
    println("Digite o ano que você nasceu:")
    var x = readlnOrNull()?.toInt() ?: 0
    println("Digite o seu nome:")
    var y = readln()
    println("Está acordado?")
    var d = readln()

// pessoa = Variável / Pessoa = Tipagem ->( Float, Dooble, Int )-> Caract. da class pessoa / Class
    var pessoa:Pessoa_ = Pessoa_(x, y)
    println(pessoa.ano_nas)
    println(pessoa.nome)
    println("Você tem ${pessoa.idade} anos")
        if (d == "sim" || d == "Sim" || d == "SIM" || d == "yes" || d == "Yes" ||  d == "YES"){
            pessoa.acorda(true)
        } else if (d == "não" || d == "Não" || d == "NÃO" || d == "no" || d == "No" ||  d == "NO"){
            pessoa.acorda(false)
        }
}