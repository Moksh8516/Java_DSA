import java.util.*;


public class Loops {

  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);

    // ----------- print hello 2 times -----------
    int i = 0;
    while(i<5){
      System.out.println("Hello");
      i+=2; // increament of 2 means (i = i+2);
    }

    // ----------- Print n numbers -------------
    // System.out.print("Enter a number: ");
    // int num = sc.nextInt();
    // int i = 0;
    // while(i<=num){
    //   System.out.println(i);
    //   i++;
    // }


    // --------------- Sum of n Number ---------------
  //   System.out.print("Enter a Number: ");
  //   int n = sc.nextInt();
  //   int sum = 0;
  //   int i =1;
  //   while(i<=n){
  //     sum += i;
  //     i++;
  //   }
  //   System.out.println("Sum of n number is "+ sum);

   // --------- Factorial --------
    // System.out.print("Enter a Factorial Number: ");
    // int n = sc.nextInt();
    // int fact = 1;
    // int i =1;
    // while(i<=n){
    // fact *= i;
    //   i++;
    // }
    // System.out.println("Factorial of "+ n + "! : " + fact);

   // --------- Check Even / Odd --------
//    System.out.println("Enter the value of A : ");
//    int A = sc.nextInt();
//    int i = 1;
//    int evenSum = 0;
//    int oddSum = 0;

//    while (i<=A){
//    if (i%2 == 0){
//     evenSum += i;
//   }else{
//     oddSum += i;
//   }
//   i++;
// }
// System.out.println("Enter your choice to see Which type of sum 0 is Even and 1 is for Odd ");
// int choice = sc.nextInt();
// if(choice == 1){
//   System.out.println("Odd Sum is "+ oddSum);
// }else{
//   System.out.println("Even Sum is "+ evenSum);
// }

// --------- Print Table of n Number --------
//     System.out.print("Enter a Number: ");
//     int n = sc.nextInt();
//     for(int i= 1; i<=10; i++){
//       System.out.println(n + " X " + i + " = " + (n*i));
//     }

// ------------ Reverse Number ------------
// int num =sc.nextInt();
// while(num>0){
//   int lastDigit = num%10;
//   System.out.print(lastDigit + " ");
//   num = num/10;
// }
// System.out.println();
// // 2nd method use rev = (rev*10)+lastdigit 
// // int rev = 0;
System.out.print("Enter a Number: ");
int num = sc.nextInt();
int rev=0;
// while(num>0){
//   int lastDigit = num%10;
//   System.out.print(lastDigit + " ");
// num =num/10;
// }
// 2nd Method
while(num>0){
  int lastDigit = num%10;
  rev = rev*10 + lastDigit;
  num/=10;
}
System.out.println(rev);

// ------------ Prime Number ------------
    // Optimize Method 
//  System.out.print("Enter a Number: ");
//  int n = sc.nextInt();
//  if(n==2){
//   System.out.println("Prime Number");
//  }else{
//   boolean isPrime = true;
//   for(int i=2; i<Math.sqrt(n); i++){
//     if(n%i == 0){
//       isPrime = false;
//       break;
//     }
//  }
//  if(isPrime == true){
//     System.out.println(n + " is a Prime Number");
//   }else{
//     System.out.println(n +" is Not a Prime Number");
//   }
//  }
}}