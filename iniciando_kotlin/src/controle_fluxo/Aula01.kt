package controle_fluxo

fun main() {
    saudacao(true)
}

fun saudacao(dia: Boolean ) = if (dia) {
    println("Bom dia")
} else {
    println("Boa tarde")
}