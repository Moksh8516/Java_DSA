import java.util.*;
public class Loops {
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);

    // ----------- print hello 2 times -----------
    // int i = 1;
    // while(i<5){
    //   System.out.println("Hello");
    //   i+=2; // increament of 2 means (i = i+2);
    // }

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
    System.out.print("Enter a Number: ");
    int n = sc.nextInt();
    for(int i= 1; i<=10; i++){
      System.out.println(n + " X " + i + " = " + (n*i));
    }
  }
}
