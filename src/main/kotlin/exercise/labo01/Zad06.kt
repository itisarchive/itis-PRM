package pl.kdudek.exercise.labo01

fun getSemesterMapping(vararg months: String): Map<String, String> =
    months.associateWith { month ->
        when (month.lowercase()) {
            "luty", "lipiec", "sierpień", "wrzesień" -> "Ferie"
            "październik", "listopad", "grudzień", "styczeń" -> "Semestr zimowy"
            "marzec", "kwiecień", "maj", "czerwiec" -> "Semestr letni"
            else -> "Nie ma takiego miesiąca"
        }
    }

fun main() {
    val result = getSemesterMapping("Styczeń", "Marzec", "Kwiecień", "Lipiec", "Unknown")
    println(result)
}