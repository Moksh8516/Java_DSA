import java.util.*;

public class Conditions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Greater than 3 number
    // System.out.print("Enter the value of A : ");
    // int A = sc.nextInt();
    // System.out.print("Enter the value of B : ");
    // int B = sc.nextInt();
    // System.out.print("Enter the value of C : ");
    // int C = sc.nextInt();
// if(A>=B && A>=C){
//   System.out.println("A is greater than B and C");
// }
// else if(B>=A && B>=C){
//   System.out.println("B is greater than A and C");
// }
// else if(C>=B && C>=A){
//   System.out.println("C is greater than B and A");
// }
// else{
// System.out.println("Sorry, Something went Wrong!");
// }

// Leap Year
System.out.println("Enter the Year ");
int year = sc.nextInt();
if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ){
System.out.println("Your Enter year is a leap Year");
}else{
  System.out.println("Your Enter year is not a leap Year");
}

// check student is pass or not with the help of ternary operator
System.out.print("Enter the marks ");
int marks = sc.nextInt();

String Total = (marks >= 33)? "Pass": "Fail";
System.out.println("You are " + Total);
  }}
