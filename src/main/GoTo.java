package main;

public class GoTo {
  public static void main(String[] args) {
    outer: for (int i = 1; i <= 10; i++) {
      System.out.println("outer loop : " + i);
      inner: for (int j = 1; j <= 10; j++) {
        if (j == 10) break inner;
        System.out.println("inner loop : " + j);
      }
    }
    System.out.println("Next Statement.");
  }
}
