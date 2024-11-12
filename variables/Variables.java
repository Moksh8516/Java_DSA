import java.util.*;

public class Variables {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String input = sc.next();
    // System.out.println(input);
    int $ = 24;
    System.out.print($);
    // System.out.print("Enter the value of A integer : ");
    // int A = sc.nextInt();

    // System.out.print("Enter the value of B integer : ");
    // int B = sc.nextInt();

    // System.out.print("Enter the value of C integer : ");
    // int C = sc.nextInt();

    // float sum = (A + B + C); // if sum is declared integer than output return in integer
    // System.out.println("Sum of Integer value is " + sum);
    
    // float Avg = (sum/3); // if sum is declared integer then output store integer value in float datatype example sum is 16 and divide by 3, output 5.0 is answer else on current situation store float value
    // System.out.println("Average of Integer value is " + Avg);

    // AreaOfSquare();
    // Add();
    // AreaOfCircle();
    // calculation();
  }
  public static void AreaOfSquare() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of side of square : ");
    int side = sc.nextInt();
    float Area = (side*side);
    System.out.println("Area of Square is " + Area);
  }

  public static void Add(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter te value of A: ");
    int a = sc.nextInt();
    System.out.println("Enter the value of B: ");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("Sum of A and B is " + sum);
  }

  public static void AreaOfCircle(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of radius of circle : ");
    int r = sc.nextInt();
    float area = (22*r*r)/7;
    System.out.println("Area of circle is: "+ area);
  }

  public static void calculation(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Price of Pencile: ");
    float pencile = sc.nextFloat();
    System.out.print("Enter the Price of Pen: ");
    float pen = sc.nextFloat();
    System.out.print("Enter the Price of Eraser: ");
    float eraser = sc.nextFloat();
    float sum = pencile + pen + eraser;
    System.out.println("Total Price :- "+sum);
    float total =sum+(sum*18)/100;
    System.out.println("Total Price with Tax is :- "+total);
  }

}
