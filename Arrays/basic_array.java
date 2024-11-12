import  java.util.*;
public class basic_array {
  public static void update(int marks[]){
    for (int i = 0; i < marks.length; i++) {
        marks[i]=marks[i]+1;
    }
  }
  public static int linearSearch(int key, int num[]){
    for (int i = 0; i < num.length; i++) {
        if(num[i]==key){
          return  i;
        }
    }
    return -1;
  }

  public static int binarySearch(int num[], int key){
    // Starting index;
    int start = 0;
    // Ending index;
    int end = num.length-1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if(key == num[mid]){
        return mid;
      }
      if(num[mid]<key){
        // Right
        start = mid+1;
      }else{
        // Left
        end = mid-1;
      }
    }
    return -1;
  }

  public static void reverseArray(int num[]){
    int first =0;
    int last = num.length-1;
    while(first<last){
      //swap
      int temp = num[last];
      num[last]=num[first];
      num[first]=temp;

      first++;
      last--;
    }
  }

  public static void pairsArray(int num[]){
    // outer loop
    int totalPair = 0;
    for(int i=0; i<num.length; i++){
      int curr = num[i]; 
      // inner Loop
      for(int j=i+1; j<num.length; j++){
        System.out.print(" ("+curr+" , "+num[j]+") ");
        totalPair++;
      }
      System.out.println(" ");
    }
System.out.println("Total Pair is : "+ totalPair);
    
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // ------------- Creating Array ----------------
      // first Method to create Array
      int marks[]= new int[50];
      marks[0]=99;
      marks[1]=67;
      marks[2]= 74;
      update(marks);
      int percentage = (marks[0]+marks[1]+marks[3])/3;
      System.out.println("Avg marks of 3 subject is : "+ percentage);

      // take input values 
      // System.out.print("Enter math marks: ");
      // marks[0]=sc.nextInt();
      // System.out.print("Enter English marks: ");
      // marks[1]=sc.nextInt();
      // System.out.print("Enter Science marks: ");
      // marks[2]=sc.nextInt();
      // int Total = (marks[0]+marks[1]+marks[3]);
      // System.out.println("Total marks is : "+Total);
      System.out.println("Total marks is : "+marks[0]); // array value be update on 0th index


      // Second Method to create Array
      int num [] = {2,4,6,8,10,12,14,16};
      int key = 12;

      //------------ Linear Search ---------------
      // find key value 10 in array
      // int index = linearSearch(key, num);
      // if(index == -1){
      //   System.out.println("Item is not found in array");
      // }else{
      //   System.out.println("Item is found on index no "+ index );
      // }
      //------------ Binary Search ---------------
      // System.out.println("Key's index value is: "+ binarySearch(num, key));

      //------------ Reverse Array ---------------
  //     reverseArray(num);
  //   for(int i=0; i<num.length; i++){
  //     System.out.print(num[i]+ " ");
  //   }
  //   System.out.println(" ");

  //------------ Pair Array ---------------
  pairsArray(num);
}
}
