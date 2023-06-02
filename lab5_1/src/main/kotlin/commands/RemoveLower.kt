package src.main.kotlin.commands
import models.Flat

//import src.server.client.server.client.server.client.main.kotlin.models.Flat
/**
 * Один из классов команд
 */
class RemoveLower : Command() {

    override val commandName: String = "remove_lower {element}"
    override fun writeString() {
        println("Удалить id ниже чем")
    }
    fun removeLower(collection: HashSet<Flat>, id: Long){
        collection.removeIf { it.id < id}
    }
}