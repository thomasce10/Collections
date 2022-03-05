package one.digitalinnovation.collections

fun main(){
    val thomas = Funcionario("thomas",5000.00, "CLT")
    val maria = Funcionario("maria",4300.00, "PJ")
    val joao = Funcionario("joao", 3500.00, "CLT")

    val funcionarios = listOf(thomas,maria,joao)
    funcionarios.forEach{println(it)}

    println("-------------------------------")
    println(funcionarios.find { it.nome == "thomas" })

    println("-------------------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("-------------------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String

){
    override fun toString(): String =
        """
           Nome : $nome
           Salario: $salario
        """.trimIndent()

}