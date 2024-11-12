import java.util.*;
public class Adv_array {
  public static void subArray(int number []) {
    // outer Loop
    for(int i = 0; i<number.length; i++){
      // inner loop
      for(int j = i; j<number.length; j++){
          // print the sub array
          for(int k = i; k<=j; k++){
            System.out.print(number[k]+" ");  
        }
        System.out.println(" ");
      }
      System.out.println(" ");
    }
  }

  // =========== Brutal Force Method ==============
  public static void maxsubArray(int number []) {
    int maxSum = Integer.MIN_VALUE;
    // outer Loop
    for(int i = 0; i<number.length; i++){
      // inner loop
      for(int j = i; j<number.length; j++){
          int sum =0;
          // print the sub array
          for(int k = i; k<=j; k++){
            System.out.print(number[k]+" ");  
            sum += number[k];  
            if(maxSum<sum){
              maxSum=sum;    
            }
          }
          System.out.println(" ");
          System.out.println("sum of sub array is: "+ sum); 
        }
        System.out.println(" ");
      }
      System.out.println("Max sum of sub array is: "+maxSum);
  }

  // =========== Prefix Subarray Sum Method ==============

  public static void prefixSubarray(int num[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
   // prefix Sum
   int prefix[] = new int [num.length];
    prefix[0]=num[0];
      // Calculate prefix sum 
    for(int i = 1; i<num.length; i++){
      prefix[i] = prefix[i-1] + num[i];
      System.out.println(prefix[i]);
    }
// Outer Loop 
for(int i = 0; i<num.length; i++){
  // i =start
  // Inner Loop
  for(int j = i; j<num.length; j++){
    // j = end
    // Calculate sum of sub array using prefix sum
    currSum = (i==0)? prefix[j]: prefix[j]-prefix[i-1];
    if(currSum>maxSum){
      maxSum=currSum;
    }
    System.out.println("sum of sub array is: "+ currSum);
  }
}
System.out.println("sum of Max sub array is: "+ maxSum);
  }

  // ------------ Kadane's Algorthim ----------------

  public static void Kadans(int num1[]){
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for(int i =0; i<num1.length; i++){
      currSum = currSum+num1[i];
      if(currSum<0){
        currSum = 0;
      }
      maxSum = Math.max(currSum,maxSum);
      System.out.println("Max sum is: "+maxSum );
      System.out.println("Current sum is: "+currSum );
      }
    }

  // ------------ Trapping Rainwater Algorthim ----------------

  public static int trappingWater(int height []){
    // length of Array
    int n = height.length;
    // Calculate Left Max Array
    int leftmax[] = new int[height.length];
    leftmax[0]=height[0];
    for(int i = 1; i<n; i++){
      leftmax[i] = Math.max(height[i],leftmax[i-1]);
    }
    // Calculate Right Max Array
    int rightmax[] = new int[height.length];
    rightmax[n-1]=height[n-1];
    for(int r = n-2; r>=0; r--){
      rightmax[r]=Math.max(height[r], rightmax[r+1]);
    }
    // Calculate Trapped Water
    int trappedWater = 0;
    for(int i = 0; i<n; i++){
      // Calculate min of left and right max
      int waterLevel = Math.min(leftmax[i],rightmax[i]);
      // Calculate trapped water
      trappedWater += waterLevel-height[i];
    }
    return trappedWater;
  }
  
  //----------- Stock buy and sell -------------
  public static int buyAndSellStock(int prices[]) {
    int maxProfit = 0;
    int buyingStock = Integer.MAX_VALUE;
    for(int i=0; i<prices.length; i++){
      if(buyingStock<prices[i]){
       int profit = prices[i]-buyingStock;
       maxProfit = Math.max(maxProfit, profit);
      }else{
        buyingStock = prices[i];
      }
    }
  return maxProfit;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number []= {2,4,6,8,10};
      int num [] = {1,-2,6,-1,3};
      int num1 [] = {-2,-3, 4,-1,-2,1,5,-3};
      int height[] = {4,2,0,6,4,2,5};
      int prices[ ]={7,1,5,3,6,4};
      // subArray(number);
      // prefixSubarray(num);
      // Kadans(num1);
    System.out.println("Total Trapped water is: "+trappingWater(height));
    System.out.println("Max Profit is: "+ buyAndSellStock(prices));
  }
}
 