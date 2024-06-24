import java.util.*;

public class CalculateGST {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

    System.out.println("Enter the cost of the item: ");

    System.out.print("Enter the cost of Pen : ");
    float pen = sc.nextFloat();

    System.out.print("Enter the cost of Pencil : ");
    float pencil = sc.nextFloat();

    System.out.print("Enter the cost of Eraser : ");
    float eraser = sc.nextFloat();

    float cost = (pen + pencil + eraser );
    System.out.println("Total Cost = " + cost);
    
    float total = (cost + (cost * 18 / 100)); 
    System.out.println("Total Amount = " + total);
    }
}
