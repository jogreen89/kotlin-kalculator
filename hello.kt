/**
 * Kotlin Kalculator
 *
 * Performs basic functions of a calculator
 */
fun main(args: Array<String>) {
  println("Kotlin Kalculator:")
  if (args.size == 0) {
    println("Please provide a username to access the calculator.")
    return
  }
  print("Welcome to the Kalculator: ${args[0]}.\n")
}
