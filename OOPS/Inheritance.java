
public class Inheritance {
  public static void main(String[] args) {   
    // Mammal dog = new Mammal();
    // dog.legs = 4;
    // dog.breath();
    // System.out.println(dog.legs);
    Horse h = new Horse();
    h.eat();
    h.walk();
    Panda p = new Panda();
    p.walk();
  }
}

// Single inheritance
// Base Class
class Animal{
  String color;

  void eat(){
    System.out.println("Eating");
  }

  void breath(){
    System.out.println("Breathing");
  }
}

// Derived Class
class fish extends Animal{

  void swim(){
    System.out.println("Swimming");
  }
}

// Multilevel Inheritance
// Derived 2 Class
class Mammal extends fish{
  int legs ;
  void walk(){
    System.out.println("Walking");
  }
}

//------------ Abstraction --------------
// Abstract Class
abstract class Pets{
  void eat(){
    System.out.println("Eating");
  }
  abstract void walk();
}

class Horse extends Pets{
  void walk(){
    System.out.println("Walking on 4 legs");
  }
}
class Panda extends Pets{
  void walk(){
    System.out.println("Walking on 2 legs");
  }
}
