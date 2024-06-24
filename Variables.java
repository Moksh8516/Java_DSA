import java.util.*;

public class Variables {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String input = sc.next();
    // System.out.println(input);
    System.out.print("Enter the value of A integer : ");
    int A = sc.nextInt();

    System.out.print("Enter the value of B integer : ");
    int B = sc.nextInt();

    System.out.print("Enter the value of C integer : ");
    int C = sc.nextInt();

    float sum = (A + B + C); // if sum is declared integer than output return in integer
    System.out.println("Sum of Integer value is " + sum);
    
    float Avg = (sum/3); // if sum is declared integer then output store integer value in float datatype example sum is 16 and divide by 3, output 5.0 is answer else on current situation store float value
    System.out.println("Average of Integer value is " + Avg);

    AreaOfSquare();

  }
  public static void AreaOfSquare() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of side of square : ");
    int side = sc.nextInt();
    float Area = (side*side);
    System.out.println("Area of Square is " + Area);
  }
}
