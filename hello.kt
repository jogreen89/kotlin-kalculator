/**
 * Kotlin Kalculator
 *
 * Performs basic functions of a calculator. Entry point
 */

class Message(val body: String) {
  fun out() {
    println("${body}")
  }
}

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
  println("Kotlin Kalculator:")
  if (args.size == 0) {
    Message("Please provide a username to access the calculator.")
    return
  }
  Message("Welcome to the Kalculator: ${args[0]}").out()
}
