package one.digitalinnovation.collections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria()= this.reduce{acc, valor -> acc + valor}
//função extendida somatoria para um array do tipo BigDecimal
fun Array<BigDecimal>.media() = if(this.isEmpty()) BigDecimal.ZERO
else this.somatoria() / this.size.toBigDecimal()
//função extendida media para um array do tipo BigDecimal, se for zero retorna zero se não for invoca a função somatoria somando todos os elementos e divide pelo tamanho do array retornando o valor media

//a função extendida adiciona novas funcões ou altera comportamentos às funções existentes sem necessidade de herdar classes