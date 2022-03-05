package one.digitalinnovation.collections

fun main(){

    val thomas = Funcionario("thomas",5000.00, "CLT")
    val maria = Funcionario("maria",4300.00, "PJ")
    val joao = Funcionario("joao", 3500.00, "CLT")

    val funcionarios1 = setOf(joao,maria)
    val funcionarios2 = setOf(thomas)

    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach { println(it) }
    println("-------------------------------")
    val funcionarios3 = setOf(joao,maria,thomas)

    val subtractUnion = funcionarios3.subtract(funcionarios1)

    subtractUnion.forEach { println(it) }
    println("-------------------------------")
    val intersectUnion = funcionarios3.intersect(funcionarios1)

    intersectUnion.forEach { println(it) }

    println("-------------------------------")
}