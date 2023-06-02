package src.main.kotlin.commands

import models.Flat

//import src.server.client.server.client.server.client.main.kotlin.models.Flat
/**
 * Уникальные значения времени до метро
 */
class PrintUniqueTimeToMetroOnFoot : Command() {

    override val commandName: String = "print_unique_time_to_metro_on_foot"
    override fun writeString() {
        println("Уникальные расстояния до метро")
    }
    fun uniqueTime(collection: HashSet<Flat>) {
        println(collection.map { it.timeToMetroOnFoot }.distinct())

    }
}