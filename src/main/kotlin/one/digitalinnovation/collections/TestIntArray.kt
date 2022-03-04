package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 5
    values[2] = 10
    values[3] = 14
    values[4] = 12

    for(value in values){
        println(value)
    }
    println("-----------------------------------")
    //imprime todos os dados contidos no array percorrendo o array

    values.forEach { it
    println(it)
    }
    println("-----------------------------------")
    // imprime o valor referenciando uma variável interna

    for(index in values.indices){
        println(values[index])
    }
    println("-----------------------------------")

    values.sort()
    // sort, rearranja os valores da array e por padrão do menor para o maior
    for(value in values){
        println(value)
    }
    //imprime o valor por referencia de indices
}