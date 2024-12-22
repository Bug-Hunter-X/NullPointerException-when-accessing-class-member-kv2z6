```scala
class MyClass(val name: String) {
  def greet(): Unit = {
    println(s"Hello, my name is $name")
  }
}

object Main extends App {
  val myObject = new MyClass("John")
  myObject.greet()

  // Safe way to handle potential null values using Option
  val nameLength = Option(myObject.name).map(_.length).getOrElse(0) 
  println(s"Name length: $nameLength")

  //handling null name at class instantiation
  val myObject2 = new MyClass(null)
  val nameLength2 = Option(myObject2.name).map(_.length).getOrElse(0)
  println(s"Name length for null name: $nameLength2")
}
```