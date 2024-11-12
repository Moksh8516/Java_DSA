import java.util.*;

public class Adv_Pattern {

  // ---------- Hollow Rectangle --------------
public static void hollowRect(int totRow, int totCol){
// outer loop
for(int i=1;i<=totRow;i++){
  // inner loop
  for(int j=1;j<=totCol;j++){
    // condition for printing
    if(i==1 || i==totRow || j==1 || j==totCol){
      System.out.print("* ");
    }else{
      System.out.print("  ");
    }
  }
  System.out.println(" ");
}}

// ----------------- Inverted & Rotated Half Pyramid -----------------
public static void invertedHalfPyramid(int n) {
  // OUTER LOOP 
  for(int i = 1; i<=n; i++){
    // INNER LOOP for Spaces
    for(int j = 1; j<=n-i; j++){
      System.out.print("  ");
    }

    // INNER lOOP FOR STARS
    for(int k=1; k<=i; k++){
      System.out.print("* ");
    }
    
    System.out.println(" ");
  }
}

// ----------------- Inverted & Rotated Half Pyramid -----------------
public static void invertedNumberPyramid(int n){
  // OUTER LOOP
  for(int i = 1; i<=n; i++){
    // INNER LOOP 
    for(int j = 1; j<=n-i+1; j++){
      System.out.print(j+" ");
    }
    System.out.println(" ");
  }
}

// ----------------- Floyd Traingle -----------------
public static void floyTri(int n){
  int num = 1;
for(int i = 1; i<=n; i++){
  // INNER LOOP
  for(int j=1; j<=i; j++){
    System.out.print(num+" ");
    num++;
  }
System.out.println(" ");
}
}

// ----------------- 0-1 Traingle -----------------
public static void binaryTri(int bin){
  // outer Loop
  for(int i=1; i<=bin; i++){
    // inner Loop
    for(int j=1; j<=i; j++){
      // Condition
      if((i+j)%2==0){
        System.out.print(1 + " ");
      }else{
        System.out.print(0 + " ");
      }
    }
    System.out.println(" ");
  }
}

// ----------------- Butterfly Pattern -----------------
public static void Butterfly(int n){
  // first  Half outer Loop
  for (int i = 1; i <=n; i++) {
      // inner Loop
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      for(int s = 1; s<=2*(n-i); s++){
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println(" ");
  }
  // 2nd Half Outer Loop
  for(int i=n; i>=1; i--){
      // inner Loop
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      for(int s = 1; s<=2*(n-i); s++){
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println(" ");
  }
}

// ----------------- Rhombus Pattern -----------------
public static void Rhombus(int n){
  for(int i =1; i<=n; i++){
    for (int s = 1; s<=n-i; s++){
      System.out.print("  ");
    }
    for(int j = 1; j<=n; j++){
      System.out.print("* ");
  }
  System.out.println(" ");
  }}
 
// ----------------- Hollow Rhombus Pattern -----------------
public static void hollowRhombus(int row){
// outer loop 
 for(int i =1; i<=row; i++ ){
  // inner loop for spaces
  for(int s = 1; s<=row-i; s++){
    System.out.print("  ");
  }
  // inner loop for stars
  for(int j = 1; j<=row; j++){
    if(i==1 || i==row || j==1 || j==row){
      System.out.print("* ");
    }else{
      System.out.print("  ");
    }
  }
System.out.println(" ");
 }
}

// ---------------- Diamond Pattern -----------------
public static void Diamond(int n){
  // outer loop for upper half
for(int i = 1; i<=n; i++){
  for(int s = 1; s<=(n-i); s++){
    System.out.print("  ");
  }
  for(int j = 1; j<=((2*i)-1); j++){
    System.out.print("* ");
  }
  System.out.println(" ");
}
// Outer Loop of 2nd Half 
for(int i = n; i>=1; i--){
  for(int s = 1; s<=(n-i); s++){
    System.out.print("  ");
  }
  for(int j = 1; j<=((2*i)-1); j++){
    System.out.print("* ");
  }
  System.out.println(" ");
}
}
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // hollowRect(4,5);
      // invertedHalfPyramid(4);
      // invertedNumberPyramid(5);
      // floyTri(8);
      // binaryTri(5);
      // Butterfly(5);
      // Rhombus(5);
      // hollowRhombus(5);
      Diamond(5);
  }
}