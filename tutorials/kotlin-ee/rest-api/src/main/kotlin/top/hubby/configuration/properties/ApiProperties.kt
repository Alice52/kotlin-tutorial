package top.hubby.configuration.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "api")
data class ApiProperties(
    var clientId: String = "",
    var url: String = "",
    var key: String = ""
)