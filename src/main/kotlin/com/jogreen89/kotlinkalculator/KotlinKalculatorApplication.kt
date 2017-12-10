package com.jogreen89.kotlinkalculator

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinKalculatorApplication

class Adder(val args: Array<Int>) {
  fun out() {
    println("Running print() in Adder")
  }
}

class Subtracter(val args: Array<Int>) {
  fun out() {
    println("Running Subtracter")
  }
}

class Multiplier(val args: Array<Int>) {
  fun out() {
    println("Running Multiplier")
  }
}

class Divider(val args: Array<Int>) {
  fun out() {
    println("Running Divider")
  }
}

fun main(args: Array<String>) {
  // Kotlin code is not running before SprintBootApplication
  println("Kotlin Kalculator:")
  if (args.size == 0) {
    Message("Please provide a username to access the calculator.")
    return
  }
  Message("Welcome to the Kalculator: ${args[0]}").out()
    SpringApplication.run(KotlinKalculatorApplication::class.java, *args)

}
