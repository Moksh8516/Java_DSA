
import java.util.Scanner;

public class TwoDArray {
  public static boolean Search(int matrix[][], int key){
    for (int i = 0; i < matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
          if(matrix[i][j] == key){
            System.out.println("your Key is found at index of " + i + "," + j);
            return true;
          }
        }
      }
      System.out.println("your Key is not found");
      return false;
  }

  public static int count(int arr[][]){
    int count1 =0;
    for (int i = 0; i < arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        if(arr[i][j] == 7){
          count1++;
        }
      }}
      return count1;
  }

  public static int sum(int arr [][]){
    int total =0;
    for (int i = 0; i < arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        total += arr[i][j];
      }}
      return total;
  }

  public static void printMatrix(int arr[][]){
    for (int i = 0; i < arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println(" ");
    }
  }

  public static void transposeMatrix(int arr[][]){
    int row = 2, col =3;
    printMatrix(arr);
    // transpose Matrix
    int[][] transposed = new int[col][row];
    for(int i=0; i<row; i++ ){
      for(int j=0; j<col; j++){
        transposed[j][i] = arr[i][j];
      }
      System.out.println("");
    }
    printMatrix(transposed);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matrix = new int[3][3];
    int arr [][] = {{4,7,8},{6,5,7}};
    System.out.println("Repeating of 7 is "+count(arr) + " times");
    System.out.println("Sum of Array is "+sum(arr));
    transposeMatrix(arr);
    // matrix
    // for(int i=0; i<matrix.length; i++){
    //   for(int j=0; j<matrix[0].length; j++){
    //     matrix[i][j] = sc.nextInt();
    //   }
    // }
    // // print matrix
    // for(int i=0; i<matrix.length; i++){
    //   for(int j=0; j<matrix[0].length; j++){
    //     System.out.print(matrix[i][j]+" ");
    //   }
    //   System.out.println();
    // }
    // Search(matrix, 5);
  }

}
