fun main() {
    // Solicita a entrada dos dois valores booleanos
    println("Digite o primeiro valor lógico (true ou false):")
    val valor1 = readln().toBoolean() // Converte entrada para Boolean

    println("Digite o segundo valor lógico (true ou false):")
    val valor2 = readln().toBoolean() // Converte entrada para Boolean

    // Verifica se ambos são verdadeiros ou falsos
    if (valor1 && valor2) {
        println("Ambos os valores são VERDADEIROS.")
    } else if (!valor1 && !valor2) {
        println("Ambos os valores são FALSOS.")
    } else {
        println("Os valores são diferentes (um verdadeiro e outro falso).")
    }
}