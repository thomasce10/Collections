package one.digitalinnovation.collections

fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Thomas"
    nomes[1] = "Joao"
    nomes[2] = "Alex"

    for(nome in nomes){ println(nome) }

    nomes.sort()
    nomes.forEach { it; println(it) }


    val nomes2 = arrayOf("Brad","Greg","Chris","Julius","Jilk")
    nomes2.sort()
    nomes2.forEach { it; println(it)}
}