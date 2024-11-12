
public class basicArray {

public static boolean distnictArray(int arr[]){
  for(int i=0; i<arr.length; i++){
    for(int j=i+1; j<arr.length; j++){
      if(arr[i]==arr[j]){
        return true;
      }
    }
  }
  return false;
}

public static int buyAndSellStock(int price[]){
int maxProfit = 0;
int purchasingPrice = Integer.MAX_VALUE;
for (int i = 0; i < price.length; i++) {
    if(purchasingPrice<price[i]){
      int profit = price[i]-purchasingPrice;
      maxProfit = Math.max(profit, maxProfit);
    }else{
      purchasingPrice = price[i];
    }
}
return maxProfit;
}

public static void tripletArray(int arr[]){
  for(int i=0; i<arr.length; i++){
    for(int j=i+1; j<arr.length; j++){
      for(int k=j+1; k<arr.length; k++){
       if(arr[i]+arr[j]+arr[k]==0){
        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
       }
      }
    }
   }
}
  public static void main(String[] args) {
    int arr [] = {-1,2,0,-1,1,-4};
    int price [] = {7,5,1,4,6,3};

    // System.out.println(distnictArray(arr));
    // System.out.println(buyAndSellStock(price));
    tripletArray(arr);
  }
  
}