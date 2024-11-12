
public class TrappedWater {
  public static int trap(int[] height) {
    int n = height.length;
    int leftmax [] = new int [height.length];
    int rightmax [] = new int [height.length];
    leftmax[0]=height[0];
    // Calculate left max height
    for(int l =1; l<n; l++){
      leftmax[l] = Math.max(leftmax[l-1], height[l]);
    }
    rightmax[n-1] = height[n-1];
    // Calculate right max height
    for(int r=n-2; r>=0; r--){
      rightmax[r] = Math.max(rightmax[r+1], height[r]);
    }
    int collectedwater = 0;
    // Calculate water level
    for(int i =0; i<n; i++){
      int waterLevel = Math.min(leftmax[i],rightmax[i]);
      collectedwater += waterLevel-height[i];
    }
    return  collectedwater;
  }
  public static void main(String[] args) {
      int height [] = {1,0,2,1,0,1,3,2,1,2,1};
      System.out.println(trap(height));
  }
}
