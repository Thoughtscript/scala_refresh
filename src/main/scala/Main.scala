// https://docs.scala-lang.org/getting-started/intellij-track/getting-started-with-scala-in-intellij.html
// https://docs.scala-lang.org/scala3/book/methods-main-methods.html

// In Scala 3, a main method is specified with the @main annotation.
// This makes sense - it's essentially the entry runnable for the app.
// Can also be specified within/on a class method: https://www.baeldung.com/scala/scala-3-main-methods
@main def run() =
  // https://stackoverflow.com/questions/1791408/what-is-the-difference-between-a-var-and-val-definition-in-scala
  // val keyword specifies an immutable const.
  val functionExample = new FunctionExamples
  functionExample.helloWorld()
  functionExample.simpleExample()
  println(functionExample.numFunc())
  println(functionExample.aHundred())

  // var can be reassigned
  var example = new ClassExample()
  println(example.id)
  example.id = 2
  println(example.id)

  // Note the absence of parentheticals
  example = new ClassExampleThree
  println(example.objectId)

  var nextExample = new ClassExampleFour
  println(nextExample.num)

  var classConstructorOne = new Constructors(1, "name")
  classConstructorOne = new Constructors(1, "name", 50)
  println(classConstructorOne.age)

// Add app initialization and startup logic above.

