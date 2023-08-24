package top.hubby.configuration

import io.undertow.UndertowOptions
import io.undertow.servlet.api.SecurityConstraint
import io.undertow.servlet.api.SecurityInfo
import io.undertow.servlet.api.TransportGuaranteeType
import io.undertow.servlet.api.WebResourceCollection
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory
import org.springframework.boot.web.servlet.server.ServletWebServerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@ConditionalOnProperty(
    name = arrayOf("server.ssl.enabled"), havingValue = "true", matchIfMissing = false
)
open class HttpsConfig {

    @Value("\${server.port}")
    private val httpPort: Int = 8034

    @Bean
    open fun servletWebServerFactory(): ServletWebServerFactory {
        val factory = UndertowServletWebServerFactory()

        factory.addBuilderCustomizers({ builder ->
            builder.setServerOption(UndertowOptions.ENABLE_HTTP2, true)
        })

        val constraint = SecurityConstraint().addWebResourceCollection(WebResourceCollection().addUrlPattern("/*"))
            .setTransportGuaranteeType(TransportGuaranteeType.CONFIDENTIAL)
            .setEmptyRoleSemantic(SecurityInfo.EmptyRoleSemantic.PERMIT);
        factory.addDeploymentInfoCustomizers({
            it.addSecurityConstraint(constraint).setConfidentialPortManager { 443 }
        })

        return factory
    }
}