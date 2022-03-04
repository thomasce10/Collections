package one.digitalinnovation.collections

fun main(){
    val values = intArrayOf(0,2,5,10,12,32,11,23)

    for(value in values){
        println(value)
    }
    println("--------------------------")
    values.sort()
    values.forEach { it
    println(it)
    }
}