package pl.kdudek.exercise.labo01

fun main() {
    val months = """
        |Styczeń, Luty, Marzec, Kwiecień, Maj, Czerwiec,
        |Lipiec, Sierpień, Wrzesień, Październik, Listopad,
        |Grudzień""".trimMargin()

    val monthList = months.split(", ", ",\n")

    println("For loop with ranges:")
    for (i in monthList.indices) {
        print("${monthList[i]} ")
    }

    println("\n\nFor loop: months starting with 'L':")
    for (month in monthList) {
        if (month.startsWith("L")) print("$month ")
    }

    println("\n\nforEachIndexed (every second month):")
    monthList.forEachIndexed { index, month -> if ((index + 1) % 2 == 0) print("$month ") }


    println("\n\nWhile loop with iterator:")
    val iterator = monthList.iterator()
    while (iterator.hasNext()) print("${iterator.next()} ")

    println("\n\nRecursive print:")
    fun printRecursive(list: List<String>) {
        if (list.isEmpty()) return
        print("${list.first()} ")
        printRecursive(list.drop(1))
    }
    printRecursive(monthList)

    println("\n\nUsing joinToString:")
    println(monthList.joinToString())

    println("\n\nforEach with filtering and replacing:")
    monthList.filter { !it.startsWith("P") }
        .forEach { print("${it.replace("e", "_")} ") }
}