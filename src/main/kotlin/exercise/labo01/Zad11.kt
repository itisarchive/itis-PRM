package pl.kdudek.exercise.labo01

object SystemLog {
    private val logs = mutableListOf<String>()

    fun writeLog(message: String) {
        logs.add(message)
    }

    fun printLogs() {
        logs.forEach { println(it) }
    }
}

class User(val firstName: String, val lastName: String) {
    var age: Int = 0

    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
        SystemLog.writeLog("Created user with age = $age")
    }

    companion object {
        var numberOfUsers = 0

        fun create(firstName: String, lastName: String): User {
            numberOfUsers++
            SystemLog.writeLog("User created via companion object")
            return User(firstName, lastName)
        }
    }
}

fun main() {
    val user1 = User("John", "Doe")
    SystemLog.writeLog("[MAIN] User created via primary constructor")
    val user2 = User("Jane", "Doe", 25)
    SystemLog.writeLog("[MAIN] User created via secondary constructor")
    val user3 = User.create("Alice", "Smith")
    SystemLog.writeLog("[MAIN] User created via companion object")

    println("Number of users: ${User.numberOfUsers}")
    SystemLog.printLogs()
}