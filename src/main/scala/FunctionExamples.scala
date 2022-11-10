// There are no static methods in Scala.
class FunctionExamples() {

  // Closures: https://www.tutorialspoint.com/scala/scala_closures.htm
  // Note the succinct multi-line syntax! Hooray!
  // No explicit return type needs to be specified.
  def simpleExample() =
    // No explicit brackets are required here.
    val ages = Seq(42, 75, 29, 64)
    // No semi-colons.
    println(s"The oldest person is ${ages.max}")

  def helloWorld() =
    println(s"Hello World!")

  // Functions: https://www.tutorialspoint.com/scala/scala_functions.htm
  // With specific return type
  def numFunc(): Int = {
    return 1
  }

  // Functions: https://www.tutorialspoint.com/scala/scala_functions.htm
  // With specific return type
  // Implicit return keyword like in Ruby
  def aHundred(): Int =
    100
}