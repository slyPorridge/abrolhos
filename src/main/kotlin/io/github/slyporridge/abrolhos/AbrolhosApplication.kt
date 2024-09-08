package io.github.slyporridge.abrolhos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class AbrolhosApplication

fun main(args: Array<String>) {
    runApplication<io.github.slyporridge.abrolhos.AbrolhosApplication>(*args)
}
