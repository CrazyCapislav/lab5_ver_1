import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//@Serializable
////@SerialName("HelpClient")

@Serializable
@SerialName("Help")
class Help : Command() {
    override val commandName: String = "help"
    override fun writeString() {
        /**
         * Список команд
         */
        println("Все команды: add, help, show, addIfMax, clear, save, update_id, removeLower, removeGreater, execute, UTTMOF, averageMetro, info, exit, removeAllByNOR, removeById")
    }
}