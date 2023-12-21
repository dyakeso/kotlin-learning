open class shape(
    var name: String
) {
    init {
        println("I am the super class")
    }

    fun changeName(newName: String) {
        name = newName
    }
}