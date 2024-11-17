
public class Classes {
  public static void main(String[] args) {
      // How to acess class in class
      Pen P1 = new Pen(); // new Pen() is a constructor of class
      // function/Method of Class
      P1.setColor("Black");
      System.out.println("Pen of Color is : "+P1.getColor());
      P1.setPrice(25);
      System.out.println("Price of Pen is : "+P1.price);
      P1.setBrand("Cello");
      // Object of Class
      P1.brand ="OX";
      System.out.println("Brand of pen is : "+P1.brand);

    //  BankAcc Bc = new BankAcc();
    //  Bc.AcNo = "123456789";
    //  Bc.username = "Moksh";
    //  Bc.setPassword("abcdefgh");
    //  System.out.println("Username is : "+Bc.username);
    //  System.out.println("Account Number is : "+Bc.AcNo);
    //  System.out.println("Password is: "+ Bc.password);// it will not access because of private

    Student std = new Student();
    std.name = "moksh";
    std.Age = 24;
    std.marks[0] = 100;
    std.marks[1] = 90;
    std.marks[2] = 80;
    Student std1 = new Student(std);
    std1.name = "Nikhil";
    for(int i=0; i<3; i++){
      System.out.println(std1.marks[i]);
    }

  }
}

class Pen{
 private String color;
  int price;
  String brand;
  

  // Setter method
  void setColor(String newColor){
    color = newColor;
  }

  //Getter Method
  String getColor(){
  return this.color;
 }

  void setPrice (int newPrice){
    price = newPrice;
  }

  void setBrand (String brandName){
    brand = brandName;
  }
}

// Access and Modifier
// Private, Default, Public, Protected

class BankAcc{
  public String username;
  private String Password;
  protected  String AcNo;

  //method
  void setPassword(String pwd){
    Password = pwd;
   System.out.println("Password is : "+Password);
  }

  void setAccountNo(String ac){
    AcNo = ac;
  }
}

// Constructor
class Student{
  String name;
  int Age;
  int marks[];
 
  // Default Constructor
  Student(){
    marks = new int[3];
    System.out.println("This is default constructor");
  }

  // Parametrized Constructor
  Student(String name, int age){
    marks = new int[3];
    this.name = name;
    this.Age = age;
    System.out.println("Constructor parametrized : " + name + Age);
  }

  // Copy Constructor
  Student(Student std1){
    marks = new int[3];
    this.name = std1.name;
    this.marks = std1.marks;
  }

}