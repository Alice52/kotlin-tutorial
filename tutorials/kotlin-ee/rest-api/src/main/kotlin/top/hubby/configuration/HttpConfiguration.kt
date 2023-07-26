package top.hubby.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter


@Configuration
open class HttpConfiguration {

    @Bean
    open fun mappingJackson2HttpMessageConverter(): MappingJackson2HttpMessageConverter {
        val converter = MappingJackson2HttpMessageConverter()
        converter.supportedMediaTypes = listOf(MediaType.ALL);

        return converter
    }
}