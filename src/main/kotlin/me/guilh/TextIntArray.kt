package me.guilh

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 4
    values[2] = 2
    values[3] = 5
    values[4] = 3

    for (valor in values){
        println(valor)
    }

    values.forEach {
        println(it)
    }

    for (index in values.indices){
        println(values[index])
    }

    values.sort() //Ordenação dos valores em ordem crescente
    for (valor in values){
        println(valor)
    }
}