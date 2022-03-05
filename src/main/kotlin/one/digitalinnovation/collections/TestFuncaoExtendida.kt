package one.digitalinnovation.collections

fun main(){

    val salarios = arrayOf("2000".toBigDecimal(),"4000".toBigDecimal(),"7500".toBigDecimal())

    println("----------------------------------------")
    println("Somatoria dos elementos do Array utilizando metodo de função extendida: ${salarios.somatoria()}")

    println("----------------------------------------")
    println("Media dos elementos do Array utilizando metodo de função extendida: ${salarios.media()}")
}