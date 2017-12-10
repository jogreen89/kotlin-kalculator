package com.jogreen89.kotlinkalculator

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinKalculatorApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinKalculatorApplication::class.java, *args)
}
