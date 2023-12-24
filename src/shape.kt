abstract class shape(
    var name: String
) {
    init {
        println("I am the super class")
    }

    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        name = newName
    }
}