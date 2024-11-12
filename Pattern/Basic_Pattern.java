import java.util.*;
public class Basic_Pattern {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

    // --------------- nested Star Pattern ---------------
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();
    // for (int i = 1; i<=rows; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    // --------------- inverted Star Pattern ---------------
    // for(int i= 1; i<=rows; i++){
    //   for(int j=1; j<=rows-i+1; j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println(" ");
    // }

    // --------------- Half Pyramid Pattern ---------------
     for (int i = 1; i<=rows; i++){
      for(int j=1; j<=i; j++){
        System.out.print(j);
      }
      System.out.println();
    }

    // --------------- char Pyramid Pattern ---------------
    char ch ='A';
    for (int i = 1; i<=rows; i++){
      for(int j=1; j<=i; j++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }
}
