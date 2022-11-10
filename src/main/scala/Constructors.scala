class Constructors(id:Int, name:String){
  // id and name aren't accessible - are essentially private with no Getters and Setters.

  var age:Int = 0

  // https://www.javatpoint.com/scala-constructor  is wrong
  // They use brackets!
  def this(id:Int, name:String, age:Int) =
    this(id, name)
    this.age = age
  // Note that the above overloads the initial parameters.
  // Using this() doesn't require fields to be expressly set in the top-level class.
}