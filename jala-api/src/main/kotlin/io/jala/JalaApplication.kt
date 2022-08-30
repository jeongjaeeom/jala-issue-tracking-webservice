package io.jala

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class JalaApplication

fun main(args: Array<String>) {
    runApplication<JalaApplication>(*args)
}
