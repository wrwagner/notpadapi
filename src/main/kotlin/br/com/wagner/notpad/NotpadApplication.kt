package br.com.wagner.notpad

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotpadApplication

fun main(args: Array<String>) {
    runApplication<NotpadApplication>(*args)
}
