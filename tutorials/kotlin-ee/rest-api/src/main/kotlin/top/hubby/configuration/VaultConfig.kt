package top.hubby.configuration

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.boot.SpringApplication
import org.springframework.boot.env.EnvironmentPostProcessor
import org.springframework.boot.logging.DeferredLogFactory
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.core.env.ConfigurableEnvironment
import org.springframework.core.env.MapPropertySource

/**
 * just can inject by spi due to the app will depend on this.
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
class VaultConfig(logFactory: DeferredLogFactory) : EnvironmentPostProcessor {

    private val logger = logFactory.getLog(this::class.java)

    override fun postProcessEnvironment(environment: ConfigurableEnvironment, application: SpringApplication) {
        try {
            val resource = ClassLoader.getSystemResourceAsStream("config.json");
            val jsonProperties: Map<String, Any> = jacksonObjectMapper().readValue(resource)
            logger.info("[VAULT] getting vault key from json file: " + java.lang.String.join(",", jsonProperties.keys))
            environment.propertySources.addFirst(MapPropertySource("vault", jsonProperties))
        } catch (e: Exception) {
            logger.warn("[VAULT] " + e.message)
        }
    }
}