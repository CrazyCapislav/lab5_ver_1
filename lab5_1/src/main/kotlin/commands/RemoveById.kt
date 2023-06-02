
package src.main.kotlin.commands

import models.Flat

//import src.server.client.server.client.server.client.main.kotlin.models.Flat

/**
 * Один из классов команд
 */
class RemoveById : Command() {

    override val commandName: String = "remove_by_id id"
    override fun writeString() {
        println("Удалить по id")
    }

    fun removeById(collection: HashSet<Flat>, id: Long) {
        val removedFlat = collection.firstOrNull { it.id == id }
        if (removedFlat != null) {
            collection.remove(removedFlat)
            println("Элемент с ID $id успешно удален из коллекции")
        } else {
            println("Элемент с ID $id не найден в коллекции")
        }
    }
}