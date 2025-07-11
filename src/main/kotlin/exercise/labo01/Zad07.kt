package pl.kdudek.exercise.labo01

fun generateNumbers(start: Int, end: Int, step: Int = 1): List<Int> {
    return (start..end step step).toList()
}

fun main() {
    val list1 = generateNumbers(1, 120, 5)
    val list2 = generateNumbers(10, 90)
    val list3 = generateNumbers(95, 130, 3)
    val list4 = generateNumbers(100, 10, 10)

    println("List1 - liczby podzielne przez 3 (pomijając liczby > 100):")
    for (n in list1) {
        if (n > 100) continue
        if (n % 3 == 0) println(n)
    }

    println("List2 - liczby podzielne przez 3 (pomijając liczby > 100):")
    for (n in list2) {
        if (n > 100) continue
        if (n % 3 == 0) println(n)
    }

    println("List3 - liczby podzielne przez 3 (pomijając liczby > 100):")
    for (n in list3) {
        if (n > 100) continue
        if (n % 3 == 0) println(n)
    }

    println("List4 - liczby podzielne przez 3 (pomijając liczby > 100):")
    for (n in list4) {
        if (n > 100) continue
        if (n % 3 == 0) println(n)
    }
}