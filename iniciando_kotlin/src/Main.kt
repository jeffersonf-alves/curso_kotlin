
fun main() {
    println("Digite seu nome: ")
    var nome = readLine()

    println("Digite sua idade: ")
    var idade = readLine()?.toInt()

    println("Seu nome é $nome e sua idade é $idade")
}