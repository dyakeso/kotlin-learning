abstract class shape(
    var name: String
) {
    constructor(name: String, vararg dismensions: Double) : this(name)
    init {
        println("I am the super class")
    }

    abstract fun perimeter(): Double

    abstract fun area(): Double

    fun changeName(newName: String) {
        name = newName
    }
}