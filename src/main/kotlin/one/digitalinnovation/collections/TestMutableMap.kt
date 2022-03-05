package one.digitalinnovation.collections

fun main(){

    val thomas = Funcionario("thomas",5000.00, "CLT")
    val maria = Funcionario("maria",4300.00, "PJ")
    val joao = Funcionario("joao", 3500.00, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(thomas.nome, thomas)

    println(repositorio.findById(thomas.nome))

    println("--------------FIND ALL--------------")
    repositorio.findAll().forEach { println(it) }

    println("--------------REMOVE--------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}