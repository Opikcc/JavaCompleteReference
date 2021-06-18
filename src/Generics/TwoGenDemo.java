package Generics;

// Demonstrate TwoGen.
public class TwoGenDemo {
  public static void main(String[] args) {
    TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
    
    // Show the types.
    tgObj.showType();
    
    // Obtain and show values.
    int v = tgObj.getOb1();
    System.out.println("value: " + v);
    
    String str = tgObj.getOb2();
    System.out.println("value: " + str);
  }
  
}
