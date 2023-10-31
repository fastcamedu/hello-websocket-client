package com.fastcampus.hellowebsocketclient

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWebsocketClientApplication

fun main(args: Array<String>) {
    runApplication<HelloWebsocketClientApplication>(*args)

    Thread.sleep(6000)
}
