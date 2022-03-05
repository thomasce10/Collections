package one.digitalinnovation.collections

fun main(){
    val thomas = Funcionario("thomas",5000.00, "CLT")
    val maria = Funcionario("maria",4300.00, "PJ")
    val joao = Funcionario("joao", 3500.00, "CLT")

    val funcionarios = mutableListOf(maria,joao)
    funcionarios.forEach { println(it) }

    println("-----------ADD ELEMENT TO LIST------------------")
    funcionarios.add(thomas)
    funcionarios.forEach { println(it) }

    println("-------------SET----------------")

    val funcionarioSet = mutableSetOf(thomas)
    imprimeSets(funcionarioSet)

    println("-----------ADD SET----------------")

    funcionarioSet.add(maria)
    funcionarioSet.add(joao)

    imprimeSets(funcionarioSet)

    println("-----------REMOVE SET----------------")

    funcionarioSet.remove(joao)
    imprimeSets(funcionarioSet)

}

fun imprimeSets(Lista: MutableSet<Funcionario>){ Lista.forEach { println(it) } }

fun imprimeMutableLista(Lista: MutableList<Funcionario>){ Lista.forEach { println(it) }}