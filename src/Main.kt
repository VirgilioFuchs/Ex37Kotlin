fun main() {
    var soma = 0.00
    var decisao = "s"
    var kgTotal = 0
    var desconto = 0.00
    while (decisao.equals("s", ignoreCase = true)) {
        println("Qual fruta você deseja? (Maçã/Morango)")
        var kg = 0
        val resposta = readln()
        if (resposta.equals("Maçã", ignoreCase = true)) {
            println("Quantos kg de maçã você quer?")
            kg = readln().toInt()
            if (kg in 1..5) {
                soma += 1.8 * kg
            } else if (kg > 5) {
                soma += 1.5 * kg
            }
        } else if (resposta.equals("Morango", ignoreCase = true)) {
            println("Quantos kg de morango você quer?")
            kg = readln().toInt()
            if (kg in 1..5) {
                soma += 2.5 * kg
            } else if (kg > 5) {
                soma += 2.2 * kg
            }
        } else {
            error("Palavra inválida, Coloque Maçã ou Morando (não precisa ser maiúsculo")
        }
        kgTotal += kg
        val formatado = String.format("%.2f", soma)
        println("Subtotal da conta: R$$formatado com $kgTotal kg")
        println("Deseja algo a mais?")
        decisao = readln()
    }
    if (!decisao.equals("S", ignoreCase = true) && !decisao.equals("N", ignoreCase = true)){
        error("Letra inválida (coloque S para sim e N para não)")
    } else{
        if (kgTotal > 8 || soma > 25) {
            desconto = soma * 0.9
            val formatado = String.format("%.2f", desconto)
            println("Total da conta: R$$formatado com desconto de 10%\n$kgTotal kg de frutas levadas")
        } else{
            val formatado = String.format("%.2f", soma)
            println("Total da conta: R$$formatado\n$kgTotal kg")
        }
    }
}