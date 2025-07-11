package pl.kdudek.exercise.labo01

fun main() {
    val original = "kot"
    var refs = original

    println("Przed zmianą: strukturalne = ${original == refs}, referencyjne = ${original === refs}")

    refs = readlnOrNull() ?: ""

    println("Po zmianie: strukturalne = ${original == refs}, referencyjne = ${original === refs}")
}