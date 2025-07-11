package pl.kdudek.exercise.labo01

open class SystemResource(val name: String, var sizeMB: Int) {
    open fun info() {
        println("Resource: $name, Size: $sizeMB MB")
    }
}

class FileResource(name: String, sizeMB: Int, val fileType: String) : SystemResource(name, sizeMB) {
    override fun info() {
        println("File: $name, Type: $fileType, Size: $sizeMB MB")
    }
}

class FolderResource(name: String, sizeMB: Int) : SystemResource(name, sizeMB) {
    val contents = mutableListOf<SystemResource>()

    fun addResource(resource: SystemResource) {
        contents.add(resource)
    }

    override fun info() {
        println("Folder: $name, Contains: ${contents.size} resources.")
    }

    operator fun plus(other: SystemResource): FolderResource {
        contents.add(other)
        return this
    }

    fun totalSize(): Int {
        return sizeMB + contents.sumOf { if (it is FolderResource) it.totalSize() else it.sizeMB }
    }
}

fun main() {
    val file1 = FileResource("file1.txt", 5, "txt")
    val file2 = FileResource("file2.jpg", 10, "jpg")
    val file3 = FileResource("file3.mp3", 15, "mp3")
    val innerFolder = FolderResource("innerFolder", 3)
    val folder = FolderResource("folder", 0)

    folder + file1
    folder + file2
    folder + file3
    innerFolder + file1
    folder + innerFolder

    folder.contents.forEach { it.info() }

    println("Total size of folder: ${folder.totalSize()} MB")
}