package pl.kdudek.exercise.labo01

fun main() {
    val products = mapOf(
        "Jabłka" to 3.0,
        "Banany" to 2.5,
        "Mleko" to 4.0,
        "Chleb" to 2.0
    )

    val discountedProducts = products.mapValues { it.value * 0.2 }
    println("Original prices: $products")
    println("Discounted prices: $discountedProducts")
}