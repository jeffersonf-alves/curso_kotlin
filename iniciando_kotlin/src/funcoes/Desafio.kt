package funcoes

fun main() {
    qtdEmAnos(2)
    println(retornaQtdString("Palavra"))
}

fun qtdEmAnos(anos: Int) {
    println("Quandtidade em meses: ${anos * 12}")
    println("Quantidade em dias:  ${anos * 365}")
    println("Quantidade em horas: ${anos * 365 * 24}")
    println("Quantidade em minutos: ${ anos * 365 * 24 * 60}")
    println("Quantidade em segundos: ${anos * 365 * 24 * 60 * 60}")

}

fun retornaQtdString(str: String): Int {
    return str.length
}