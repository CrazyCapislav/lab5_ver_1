package src.main.kotlin.commands

import models.Flat

/**
 * Один из классов команд
 */
class Show : Command() {

    override val commandName: String = "show"
    override fun writeString() {
        println("Имена элементов коллекции")
    }

    fun showElement(collection: HashSet<Flat>) {
        if (collection.isEmpty()) {
            println("Коллекция пуста")
        } else {
            collection.forEach { el ->
                println(el.toString())
            }
        }
    }
}
