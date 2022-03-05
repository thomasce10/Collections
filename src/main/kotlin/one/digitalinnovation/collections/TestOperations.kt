package one.digitalinnovation.collections

fun main(){

    val salarios = doubleArrayOf(3200.0,4300.0,5200.0,1300.0,2300.0)

    salarios.sort()

    for(salario in salarios){
        println(salario)
    }

    println("-------------------------------------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2000 = salarios.filter { it > 2000.0 }

    salariosMaiorQue2000.forEach{ println(it)}

    println("-------------------------------------------------")
    println(salarios.count{ it in 2000.0..5000.00})

    println("-------------------------------------------------")
    println(salarios.find{ it == 2000.0})
    println(salarios.find{ it == 2300.0})

    println(salarios.any{ it == 2300.0})



}