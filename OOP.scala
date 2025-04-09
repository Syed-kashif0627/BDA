//Functions in scala

class Sample1{
    def fun(a:Int,b:Int):Unit={
        println("Value of a: "+a)

        println("Value of B: "+b)
    }
}


class S2(a:Int,b:Int){
    def fun():Unit={
        println("This is \"a\" Value: "+a)
        println("This is \"B\" Value: "+b)
    }
}
// object OOP extends App{

//     val obj=new Sample1()
//     obj.fun(19,34)

//     val obj2=new S2(1,6)
//     obj2.fun()
// }

//Method Overloading Demo
// object MethodOverloadingDemo {
//   // Method with one parameter
//   def greet(name: String): Unit = {
//     println(s"Hello, $name!")
//   }

//   // Overloaded method with two parameters
//   def greet(name: String, age: Int): Unit = {
//     println(s"Hello, $name! You are $age years old.")
//   }

//   // Overloaded method with no parameters
//   def greet(): Unit = {
//     println("Hello, Guest!")
//   }

//   def main(args: Array[String]): Unit = {
//     greet("Alice")              
//     greet("Bob", 25)            
//     greet()                     
//   }
// }


// Method Overriding Demo
// class Animal {
//   def sound(): Unit = {
//     println("Animals make different sounds")
//   }
// }

// // Child class
// class Dog extends Animal {
//   // Overriding the sound method
//   override def sound(): Unit = {
//     println("Dogs bark")
//   }
// }

// // Main object
// object MethodOverridingDemo {
//   def main(args: Array[String]): Unit = {
//     val animal = new Animal
//     animal.sound() // Calls the method from the parent class

//     val dog = new Dog
//     dog.sound() // Calls the overridden method in the child class
//   }
// }


// Abstract Class in Scala
abstract class Parent1 {
  def sample():Unit // Abstract method
  def sample1(): Unit = { // Concrete method
    var x: Int = 40
    println(x)
  }
}

class Child1 extends Parent1 {
  def sample(): Unit = { // Overriding the abstract method
    println("This is an abstract method")
  }
}

// object AbstractDemo {
//   def main(args: Array[String]): Unit = {
//     var obj = new Child1()
//     obj.sample()
//     obj.sample1()
//   }
// }



// Single Inheritance
class Parent {
  var x: Int = 0

  // Method in the parent class
  def sample1(a: Int): Unit = {
    x = a
    println("Value of x: " + x)
  }
}

// Child class inheriting from Parent
class Child extends Parent {
  var y: Int = 0

  // Method in the child class
  def sample2(b: Int): Unit = {
    y = b
    println("Value of y: " + y)
  }
}

// // Main object to demonstrate Single inheritance
// object InheritDemo3 {
//   def main(args: Array[String]): Unit = {
//     // Creating an instance of the child class
//     val obj = new Child()

//     // Calling parent class method
//     obj.sample1(39)

//     // Calling child class method
//     obj.sample2(59)
//   }
// }




//Multiple Inheritance demo using trait similar to interface in java
// Trait 1
trait TraitA {
  def methodA(): Unit = {
    println("Method from TraitA")
  }
}

// Trait 2
trait TraitB {
  def methodB(): Unit = {
    println("Method from TraitB")
  }
}

// Class implementing both traits
class MultipleInheritanceDemo extends TraitA with TraitB {
  def display(): Unit = {
    println("Class implementing multiple traits")
  }
}

object Demo {
  def main(args: Array[String]): Unit = {
    val obj = new MultipleInheritanceDemo()
    obj.methodA()    // Accessing method from TraitA
    obj.methodB()    // Accessing method from TraitB
    obj.display()    // Accessing method from the class itself
  }
}
