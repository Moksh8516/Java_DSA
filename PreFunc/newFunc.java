
import java.util.*;

public class newFunc{
  public static int sum(int a, int b){
    return a+b;
  }
  // ------------- Function overloading with parameters -------------
  public static int sum(int a, int b, int c){
    return a+b+c;
  }

  // ------------- Function overloading with Data types -------------
  public static float sum(int a, float b){
    return a+b;
  }

  // ------------- Product -------------
  public static int product(int a, int b){
    return a*b;
  }

  // ------------- Factorial -------------
  public static int factorial(int n){
    if(n==0){
      return 1;
    }
    else{
      int fact = 1;
      for(int i = 1; i<=n; i++){
        fact *=i;
      }
      return fact;
    }
  }

  // ------------- Binomial Coefficient = Formula is nCr n!/r!(n-r)! -------------
public static float  bioCoeff(int n , int r){
 int a = factorial(n);
 int b = factorial(r);
 int c = factorial(n-r);

 float biocoefficent = a/(b*c);
 return biocoefficent;
}

  // ------------- Optimize way to find Prime Number -------------
  public static boolean PrimeNumber(int n){
    boolean isPrime = true;
    if(n==2){
      return true;
    }
    for (int i =2; i<=Math.sqrt(n); i++){
      if(n%i==0){
        isPrime = false;
        break;
      }
    }
    // if(isPrime){
    //   System.out.println(n + " is Prime Number");
    // }else{
    //   System.out.println(n + " is not Prime Number");
    // }
    return isPrime;
  }

  // ------------- Prime Number in range -------------
  public static void primeInRange(int n){
    for(int i = 2; i<=n; i++){
      if(PrimeNumber(i)){
        System.out.print(i + " ");
      }
    }
System.out.println(" ");
  }

  // ------------- Binary to Decimal -------------

  public static void binNumber(int n){
    int binNum= n;
    int dec = 0;
    int power =0;
    while(n>0){
      int lastDigit = n%10;
      dec = dec + (lastDigit * (int)Math.pow(2, power));
      power++;
      n=n/10;
    }
    System.out.println("Decimal Number of " + binNum +" is: "+ dec);
  }

  // ------------- Decimal to Binary -------------
public static void DeciNumber(int deciNum){
  int deci = deciNum;
  int binNum = 0;
  int power = 0;
  while(deciNum>0){
    int rem = deciNum%2;
    binNum= binNum + (rem*(int)Math.pow(10, power));
    power++;
    deciNum = deciNum/2;
  }
  System.out.println("Binary Number of " + deci +" is: "+ binNum);

}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println(sum(5,7));
    // System.out.println(sum(5,7, 12));
    // System.out.println(sum(5,24));
    // int a = 24;
    // int b = 5;
    // int prod = product(a, b);
    // System.out.println("a * b = "+prod);
    // System.out.print("Enter the number of n Factorial: ");
    // int n = sc.nextInt();
    // System.out.print("Enter the number of r factorial: ");
    // int r = sc.nextInt();
    // System.out.println("Bio Coefficent Number is : "+bioCoeff(n, r));
    System.out.println(PrimeNumber(34));
    // primeInRange(100);
    binNumber(10011);
    DeciNumber(19);
  }
}