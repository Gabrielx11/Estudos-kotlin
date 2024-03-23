fun main() {
    var i = 0
    while (i<=10){
        println("${i}")
        i++ // i = 1+1
    }
    println("\n")
    while (i>=0) {
        println("${i}")
        i-- // i = 1-1
    }
    println("\n")
    var  str = "Curso show"
    var j = 0
    while (j<str.length){
        println("${j}")
        j++
    }
    println("\n ${str[0]}")
    println("\n ${str.length}")
}