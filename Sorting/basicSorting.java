

public class basicSorting{
  public static void BubbleSorting(int arr[]){
    int n = arr.length;
    int swap =0;
    for(int i =0; i<n-1; i++){
      for(int j =0; j<n-i-1; j++){
        // in case of already a sorted array
        //Condition of Swap
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swap++;
        }
      }
    }
    System.out.println("No of Swaping : "+swap);
    for(int p = 0; p < arr.length; p++) {
        System.out.print(arr[p]+" ");
    }
  }

  public static void SelectionSort(int arr[]){
    for(int i=0; i<arr.length; i++ ){
      int minPostion = i;
      for(int j=i+1; j<arr.length; j++){
        if(arr[minPostion] > arr[j]){
          minPostion = j;
      }
    }
    // swap
    int temp = arr[i];
    arr[i] = arr[minPostion];
    arr[minPostion] = temp;
    }
    for(int p = 0; p < arr.length; p++) {
      System.out.print(arr[p]+" ");
  }
  }

  public static void InsertionSort(int arr[]){
    for(int i = 0; i<arr.length; i++){
      int curr = arr[i];
      int prev = i-1;
      // Find out the correct position of insertion
      while(prev>=0 && arr[prev]>curr){
        arr[prev+1] = arr[prev];
        prev--;
      }
      // insertion
      arr[prev+1]=curr;
    }
  }

  public static void CountSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++){
      largest = Math.max(largest, arr[i]);
    }
    // size of array
    int newArr [] = new int [largest+1];
    for(int j=0; j<arr.length; j++){
      newArr[arr[j]]++;
    }

    // Sorting
    int n =0;
    for(int i =0; i<newArr.length; i++){
      while(newArr[i] > 0){
        arr[n]=i;
        n++;
        newArr[i]--;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {5, 2, 8, 1, 9}; // Time Comlexity is O(n^2)
    // int[] arr = {1,2,5,8,9};  // Time Complexity is O(n)
    // BubbleSorting(arr);
    // SelectionSort(arr);
    // InsertionSort(arr);
    CountSort(arr);  // Time compexity is O(n,range) Specialy apply in limited positive no

 for(int i = 0; i < arr.length; i++) {
       System.out.print(arr[i]+" ");
   }



    // Inbuilt function of Sort  ::----> Time compexity is O(nlogn)
    // Arrays.sort(arr, starting, ending);
    // Arrays.sort(arr, starting, ending , Collections.reverseOrder());
  //   Integer array [] = {7,3,1,2,5,9};
  //   Arrays.sort(array,Collections.reverseOrder());
  //   System.out.println("Inbuilt sorting");
  //  for(int i = 0; i < array.length; i++) {
  //      System.out.print(array[i]+" ");
  //  }
  }
}