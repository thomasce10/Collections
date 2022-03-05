package one.digitalinnovation.collections

fun main(){

    val pair: Pair<String, Double> = Pair("Joao", 2300.00)
    val map1 = mapOf(pair)

    map1.forEach { nome , salario -> println("Chave: $nome - Valor: $salario") }

    val map2 = mapOf("Thomas" to 2400,"Mary" to 3200)

    println("---------------------------------------")
    map2.forEach { nome, salario -> println("Chave: $nome - Valor: $salario") }
}