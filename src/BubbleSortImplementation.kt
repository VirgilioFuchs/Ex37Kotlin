fun main() {
    val numeros = mutableListOf(5, 2, 8, 1, 3)

    for (i in 0 until numeros.size - 1) {
        for (j in 0 until numeros.size - i - 1) {
            if (numeros[j] > numeros[j + 1]) { // Troca de valores
                val temp = numeros[j]
                numeros[j] = numeros[j + 1]
                numeros[j + 1] = temp
            }
        }
    }

    println("Números ordenados manualmente: $numeros")
}