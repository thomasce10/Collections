package one.digitalinnovation.collections

fun main(){
    val salarios = DoubleArray(3)
        salarios[0] = 1000.0
        salarios[1] = 2000.0
        salarios[2] = 4000.0

    salarios.forEach { println(it) }
    println("-------------------------------------------------")
    salarios.forEachIndexed {index, salario -> salarios[index] = salario * 1.1  }

    salarios.forEach { println(it) }
    println("-------------------------------------------------")
    val salarios2 = doubleArrayOf(1500.0,3400.0,2100.0)

    salarios2.sort()
    salarios2.forEach { println(it) }

    println("-------------------------------------------------")

    salarios2.forEachIndexed { index, salario2 -> salarios2[index] = salario2 * 1.2  }
    salarios2.forEach { println(it) }
}