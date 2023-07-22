package top.hubby

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class RestApiApplication

fun main(args: Array<String>) { // fun main(vararg args: String) {
    runApplication<RestApiApplication>(*args)
}

// logger()
inline fun <reified R : Any> R.logger(): Logger =
    LoggerFactory.getLogger(this::class.java.name.substringBefore("\$Companion"))

// Optional.of("asa").opToList()
inline fun <T : Any> Optional<out T>.opToList(): List<T> = if (isPresent) listOf(get()) else emptyList()

