package top.hubby.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import top.hubby.configuration.properties.ApiProperties
import top.hubby.configuration.properties.MqttProperties
import top.hubby.logger
import javax.annotation.PostConstruct

@Configuration
@EnableConfigurationProperties(ApiProperties::class, MqttProperties::class)
class Configuration(val api: ApiProperties, val mqtt: MqttProperties) {

    @Value("\${api.clientId:}")
    lateinit var clientId: String

    @PostConstruct
    fun apiProperties() {
        logger().info("api properties: {}, and mqtt:}", api, mqtt)
        logger().info("api properties: {}, and mqtt:}", api, mqtt)
    }
}