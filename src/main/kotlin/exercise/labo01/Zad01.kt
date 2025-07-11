package pl.kdudek.exercise.labo01

fun main() {
    val byteVal: Byte = 1
    val shortVal: Short = 2
    val intVal: Int = 42
    val longVal: Long = 42L
    val floatVal: Float = 3.14F
    val doubleVal: Double = 3.14
    val charVal: Char = 'A'
    val booleanVal: Boolean = true
    val stringVal: String = "Hello"

    // val doubleFromInt: Double = intVal
    // val longFromInt: Long = intVal
    // val charFromInt: Char = intVal
    // val stringFromInt: String = intVal

    val doubleFromInt = intVal.toDouble()
    val longFromInt = intVal.toLong()
    val charFromInt = intVal.toChar()
    val stringFromInt = intVal.toString()

    println(byteVal)
    println(shortVal)
    println(intVal)
    println(longVal)
    println(floatVal)
    println(doubleVal)
    println(charVal)
    println(booleanVal)
    println(stringVal)
    println(doubleFromInt)
    println(longFromInt)
    println(charFromInt)
    println(stringFromInt)
}