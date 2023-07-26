package top.hubby.configuration.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "myconfig")
open class MqttProperties {
    lateinit var myHost: String
    lateinit var myPort: String
    lateinit var myUser: String
    lateinit var myPass: String
}