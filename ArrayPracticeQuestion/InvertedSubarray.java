
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
  public static void main(String[] args) {
      int arr []= {4,5,6,7,0,1,2};
      System.out.println("Element is present at index of " + binarySearch(arr, 8));

  }
}
