
public class InvertedSubarray {
  public static int binarySearch(int arr[], int target){
    int n = arr.length;
    int start =0;
    int end = n-1;
    while(start < end){
      int mid = (start + end)/2;
      if(arr[mid]==target){
        return mid;
      }
      else {
      if (arr[mid]<target) {
          start = mid +1;
      }else{
        end = mid -1;
      }
    }
  }
  return -1;
}

// Diagonal Sum
public static void DiagnoalSum(int matrix[][]){
  // Time Compexity is O(n^2) ----> Brutal's Algorithm
  // Sum of Diagonal on even no :: n*n
  int Sum =0;
  // outer loop
  for(int i =0; i<matrix.length; i++){
    for(int j=0; j<matrix.length; j++){
      // primary Diagonal
      if(i==j){
        Sum += matrix[i][j];
        System.out.print(matrix[i][j]+" ");
      }else if (i+j==matrix.length-1) {
          // Secondary Diagonal sum 
          Sum += matrix[i][j];
          System.out.print(matrix[i][j]+" ");
      }
    }
    System.out.println();
  }
  System.out.println("Sum of Diagonal is :- "+ Sum);
} 

// Sum of Diagonal with optimize method in linear time Complexity => O(n)
public static void DiagonalSumOptimize(int matrix[][]){
  int sum = 0;
  for(int i =0; i<matrix.length; i++){
    // primary Diagonal
    sum += matrix[i][i];
    // Secondary Diagonal sum
    if(i != matrix.length-i-1){
      sum += matrix[i][matrix.length-i-1];
    }
  }
  System.out.println("Sum of Diagonal is :- "+ sum);

}
public static void main(String[] args) {
      int arr []= {4,5,6,7,0,1,2};
      // System.out.println("Element is present at index of " + binarySearch(arr, 8));
      int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      // DiagnoalSum(matrix);
      DiagonalSumOptimize(matrix);
  }
}
