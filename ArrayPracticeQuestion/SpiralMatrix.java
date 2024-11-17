
public class SpiralMatrix {
  public static void printSpiral(int matrix[][]){
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length-1;
    int endCol = matrix[0].length-1;
    while(startRow <= endRow && startCol <= endCol){
      // Top
      for(int t=startCol; t<=endCol; t++){
        System.out.print(matrix[startRow][t] + " ");
      }

      // right
      for(int r=startRow+1; r<=endRow; r++){
        System.out.print(matrix[r][endCol] + " ");
      }
      // bottom
      for(int b=endCol-1; b>=startCol; b--){
        System.out.print(matrix[endRow][b] + " ");
      }
      // left
      for(int l = endRow-1; l>=startRow+1; l--){
        System.out.print(matrix[l][startCol] + " ");
      }
      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
    System.out.println(" ");
  }

  // Top to bottom approach
  public static boolean sortedMatrix(int sortMatrix[][], int key){
    // Time Compexity is O(n+m)
    int row = 0;
    int col = sortMatrix[0].length-1;
    while(row<sortMatrix.length && col>=0){
      if(sortMatrix[row][col]==key){
        System.out.print("Key is found at index no : ("+row+","+col+")");
        return true;
      }else if(key<sortMatrix[row][col]){
        // left
        col--;
      }else{
        // bottom
        row++;
      }
    }
    System.out.println("Key is not found");
    return false;
  }

  // Bottom to top approach
  public static void main(String[] args) {
      int matrix [][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      int sortMatrix[][]={{10,20,30,40},{15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
      // printSpiral(matrix);
      sortedMatrix(sortMatrix, 39);
  }
}
