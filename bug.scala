```scala
class MyClass(val name: String) {
  def greet(): Unit = {
    println(s"Hello, my name is $name")
  }
}

object Main extends App {
  val myObject = new MyClass("John")
  myObject.greet()

  // This will throw an exception if name is null
  val nameLength = myObject.name.length 
}
```