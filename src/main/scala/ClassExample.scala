class ClassExample() {
  // Getters and setters are automatically created.
  var id = 0
  // Use val to seal/freeze the object field.
  val objectId = 111111
}

// Subclass
class ClassExampleTwo() extends ClassExample {}

trait traitExample() {
  var num = -10
}

// Self Types - mixes a trait with a class but does not subclass
// Trait attributes won't be accessible.
// https://docs.scala-lang.org/tour/self-types.html - to be used when some class must have some type.
class ClassExampleThree() extends ClassExample with traitExample {}

// When a class directly extends/subclasses a trait the attributes can be accessed.
class ClassExampleFour() extends traitExample {}