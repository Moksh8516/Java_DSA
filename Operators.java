  import java.util.*;
public class Operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A integer : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of B integer : ");
        int y = sc.nextInt();

        int exp1 = (x * y/x);
        int exp2 = (x * (y/x));
        System.out.print("expersion Value of " + exp1 + " expersion value 2 is " + exp2);
        // expersion Value of 5 expersion value 2 is 4  ; value of A is 2 and B is 5


        // int A = 200, B = 50, C = 100;
        // if(A>B && B>C){
        //   System.out.println("A is greater than B and C");
        // }
        // else if (C>B && A>C){
        //   System.out.println("C is greater than B and A");
        // }
        // if ((B+200)< A && (B+150) <C){
        //   System.out.println("y is less than x and z");
        // }


        // Calculator
        // System.out.print("Enter an operator (+, -, *, /): ");
        // char operator = sc.next().charAt(0);
        // switch (operator) {
        //     case '+':
        //         System.out.println("Your sum is " + (x + y));
        //         break;
        //     case '-':
        //         System.out.println("Your sum is " + (x - y));
        //         break;
        //     case '*':
        //         System.out.println("Your product is " + (x * y));
        //         break;
        //     case '/':
        //         if (y != 0) {
        //             System.out.println("Your quotient is " + (x / y)); 
        //         }else {
        //             System.out.println("Cannot divide by zero");
        //         }
        //         break;
        //     default:
        //         System.out.println("Invalid operator");
        // }
    }
}
