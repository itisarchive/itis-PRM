package pl.kdudek.exercise.labo01

abstract class Figure(val name: String = "Figure") {
    abstract fun area(): Double
    abstract fun perimeter(): Double

    open fun describe() {
        println("I am a figure named $name.")
    }
}

class Square(val side: Double) : Figure("Square") {
    override fun area() = side * side
    override fun perimeter() = 4 * side
}

class Rectangle(val width: Double, val height: Double) : Figure("Rectangle") {
    override fun area() = width * height
    override fun perimeter() = 2 * (width + height)
}

class Circle(val radius: Double) : Figure("Circle") {
    override fun area() = Math.PI * radius * radius
    override fun perimeter() = 2 * Math.PI * radius
}

fun Figure.details(): String =
    "Figure: $name, Area: ${area()}, Perimeter: ${perimeter()}"

fun main() {
    val figures: List<Figure> = listOf(
        Square(5.0),
        Rectangle(3.0, 4.0),
        Circle(2.0)
    )
    figures.forEach {
        it.describe()
        println("My area is ${it.area()} and my perimeter is ${it.perimeter()}.")
        println(it.details())
    }
}