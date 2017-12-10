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
  fun print() {
    println("Running print() in Adder")
    // Message("${}")
  }
}


fun main(args: Array<String>) {
  println("Kotlin Kalculator:")
  if (args.size == 0) {
    Message("Please provide a username to access the calculator.")
    return
  }
  // Adder(arrayOf(1, 2, 3)).print()
  Message("Welcome to the Kalculator: ${args[0]}.").out()
}
