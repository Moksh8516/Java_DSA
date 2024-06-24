public class Basic_Patterns {
  public static void main(String[]arg){
    // ------- Star Pattern ---------
System.out.println("1) Printed Star Pattern ");
for(int i=1; i<=5; i++){
  for(int j=1; j<=i; j++){
    System.out.print("* ");
  }
  System.out.println("");
}

// --------- Inverted Star Patterns ----------
System.out.println("\n2) Printed Inverted Star Pattern ");
for(int i=1; i<=5; i++){
  for(int j=1; j<=5-i+1; j++){
    System.out.print(" *");
  }
  System.out.println("");
}

// --------- Inverted Star Patterns ----------
System.out.println("\n3) Printed Half Pyramid Pattern ");
for(int i=1; i<=5; i++){
  for(int j=1; j<=i; j++){
    System.out.print(j);
  }
  System.out.println("");
}
// --------- Character Patterns ----------
System.out.println("\n4) Printed Half Pyramid Pattern ");
int n = 5;
char ch = 'A';
for(int i=1; i<=n; i++){
  for(int j=1; j<=i; j++){
    System.out.print(ch);
    ch++;
  }
  System.out.println("");
}
  }
}
