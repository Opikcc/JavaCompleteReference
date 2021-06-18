package main;

public class appServer {
  public static void main(String[] args) {
    byte a = 0b00000001, b;
    int i, j;
    
//    i = a << 2;
//    b = (byte) (a << 2);
    
    for (i=1;i<10;i++) {
      j = a << i;
      System.out.println("Original value of a : " + (byte) j);
    }
//    System.out.println("i and b : " + i + " " + b);
  }
 
}


