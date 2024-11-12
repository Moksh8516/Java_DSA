import java.util.*;

public class Conditions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // --------- Greater than 3 number ----------
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

// --------- Leap Year ----------
System.out.println("Enter the Year ");
int year = sc.nextInt();
if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ){
System.out.println("Your Enter year is a leap Year");
}else{
  System.out.println("Your Enter year is not a leap Year");
}

// -------- check student is pass or not with the help of ternary operator --------
// System.out.print("Enter the marks ");
// int marks = sc.nextInt();

// String Total = (marks >= 33)? "Pass": "Fail";
// System.out.println("You are " + Total);

// --------- Even/Odd number ----------
// System.out.print("Enter number : ");
// int num = sc.nextInt();

// String result = (num %2 == 0) ? "Even" :"Odd";
// System.out.println("Number is " + result);

// --------- InCome Tax ----------
// System.out.print("Enter your Salary : ");
// int salary = sc.nextInt();
// int tax;
// if(salary <= 500000){
//   tax = 0;
//   System.out.println("Your salary is below the taxiation limit of 5L and your tax is :- " + tax);
// }else if(salary>500000 && salary <= 1000000){
//   tax = (int) (salary * 0.2);
//   System.out.println("Your salary is between 5L to 10L and your tax is :- "+tax);
// }else{
//   tax = (int) (salary * 0.3);
//   System.out.println("Your salary is above 10L and your tax is :- "+tax);
// }

// --------- Find Prime Number ----------
// System.out.print("Enter your number: ");
// int num = sc.nextInt();
// int div = 2;
// boolean isPrime = true;
// while (div<num) { 
//     if (num%div==0) {
//       isPrime = false;
//     }
//     div++;
//   }
//   if(isPrime == true){
//   System.out.println(num + " is a prime number");
//   }else{
//     System.out.println(num + " is not a prime number");
//   }

// --------- Find Days ----------
System.out.print("Enter the number of the Day between 1 to 7 : ");
int day = sc.nextInt();
switch (day) {
    case 1 :
        System.out.println("Monday");
        break;
    case 2 :
        System.out.println("Tuesday");
        break;
    case 3 :
        System.out.println("Wednesday");
        break;
    case 4 :
        System.out.println("Thursday");
        break;
    case 5 :
        System.out.println("Friday");
        break;
    case 6 :
        System.out.println("Saturday");
        break;
    case 7 :
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid Day");
}
  }}