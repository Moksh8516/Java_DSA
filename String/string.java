import java.util.*;

public class string {
  public static void printString(String fullName){
    for(int i =0; i<fullName.length(); i++){
      System.out.print(fullName.charAt(i)+" ");
    }
    System.out.println(" ");
  }

  public static boolean plaindrome(String plaindrome){
    int n = plaindrome.length();
  for(int i =1 ;i<=n/2; i++){
    if(plaindrome.charAt(i) != plaindrome.charAt(n-i-1)){
      System.out.println(plaindrome + " is not Plaindrome Category");
      return false;
    }
  }
  System.out.println("Your String is Plaindrome Category");
  return true;
  }

  public static float shortestPath(String path){
    int y=0;
    int x=0;
    for(int i =0; i<path.length(); i++){
      char dir = path.charAt(i);
      // North
      if(dir == 'N'){
        y++;
      }
      // East
      else if(dir == 'E'){
        x++;
      }
      // South
      else if(dir == 'S'){
        y--;
      }
      // West
      else if(dir == 'W'){
        x--;
      }else{
        System.out.println("Invalid direction");
      }
    }
    int X2 = x*x;
    int Y2 = y*y;
    float distance = (float)Math.sqrt(X2+Y2);
    System.out.println("The shortest path is " + distance);
    return distance;
  }

  //Find the Largest String on the basis of LexicalScoping 
  public static void largestStr(String fruits[]){
    String largest = fruits[0];
    for(int i =0; i<fruits.length; i++){
      // 3 Case of Compare fun. Output :- str1==str2 = 0,equal; str1<str2 = <0.-ve; str1>str2 = >0,+ve;
      if(largest.compareToIgnoreCase(fruits[i])<0){
        largest = fruits[i];
    }
  }
  System.out.println("Largest String is :- "+largest);
  }

  // Convert First letter to UpperCase in String
  // Time Compexity is O(n)
  public static String firstUpper(String str){
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i =1; i<str.length(); i++){
      if(str.charAt(i)==' ' && i<str.length()-1){
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      }else{
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  // =============== Find Vowel ===============
   public static String findVowel(String str1){
    int count =0; 
    for(int i=0; i<str1.length(); i++){
      char ch = str1.charAt(i);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        count++;
      }
    }
    return "Number of Vowel in String is :- "+count;
   }

   // ============== Compress String =============
   public static void compressString(String str) {
       
   }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // First Type
      String str = "hello world";
    // Second Type
      String str1 = new String("java is funny language and also intersting");
    // System.out.println(str);
    // System.out.println(str1);
    
    // System.out.print("Enter your first name: ");
    // String firstName = sc.next();
    // System.out.print("Enter your last name: ");
    // String lastName = sc.next();
    //----------------- Concatenate ---------------------
    // String fullName = firstName + " " + lastName;
    // System.out.println(fullName);
    //------------ find length ------------------
    // System.out.println("Length of first name: " + firstName.length());
    // printString(fullName);
    // plaindrome("madam");
    String path =  "WNEENESENNN";
    // System.out.println("The shortest path is " + shortestPath(path));
    String fruits [] = {"apple", "bannana", "Carrat", "Avocado", "brokali", "Cauliflower" };
    // largestStr(fruits);
    // System.out.println(firstUpper(str));
    System.out.println(findVowel(str1));
  }
}
