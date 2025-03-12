fun bubbleSort(lista: MutableList<Int>): List<Int> {
    for (i in 0 until lista.size - 1) {
        for (j in 0 until lista.size - i - 1) {
            // Troca os elementos se o atual for menor que o próximo 
            if (lista[j] < lista[j + 1]) {
                val temp = lista[j]
                lista[j] = lista[j + 1]
                lista[j + 1] = temp
            }
        }
    }
    return lista
}

fun main() {
    val numeros = mutableListOf(25, 5, 10)
    val ordenado = bubbleSort(numeros)
    println("Números em ordem decrescente: $ordenado")
}

