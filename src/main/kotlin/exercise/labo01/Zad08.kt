package pl.kdudek.exercise.labo01

fun normalize(data: List<String?>): List<String> =
    data.filterNotNull().filter { it.trim().isNotEmpty() }.map { it.uppercase() }

fun main() {
    val inputData = listOf("Ala", null, "", "Kotlin", null, "")
    println(normalize(inputData))
}