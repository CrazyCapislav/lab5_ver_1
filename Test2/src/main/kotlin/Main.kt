import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main() {
    val help = Help()
    println(Json.encodeToString(help))
}