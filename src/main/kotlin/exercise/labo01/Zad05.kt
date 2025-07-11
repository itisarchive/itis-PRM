package pl.kdudek.exercise.labo01

fun main() {
    val products = mapOf(
        "mleko" to 2.5, "chleb" to 2.0, "masło" to 4.0, "jajka" to 3.0
    )

    val chlebPrice = products["chleb"]?.toString() ?: "Nie znaleziono"
    println(chlebPrice)
}