package Generics;

// Demonstrate wildcard
public class WildCardDemo {
  public static void main(String[] args) {
    Integer iNums[] = {1, 2, 3, 4, 5};
    Stats<Integer> iob = new Stats<Integer>(iNums);
    double v = iob.average();
    System.out.println("iob average is " + v);

    Double dNums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
    Stats<Double> dob = new Stats<Double>(dNums);
    double w = dob.average();
    System.out.println("dob average is " + w);

    Float fNums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
    Stats<Float> fob = new Stats<Float>(fNums);
    double x = fob.average();
    System.out.println("fob average is " + x);

    // See which arrays have same average.
    System.out.print("Averages of iob and dob ");
    if (iob.sameAvg(dob))
      System.out.println("are the same");
    else
      System.out.println("differ.");

    System.out.print("Averages of iob and fob ");
    if (iob.sameAvg(fob))
      System.out.println("are the same");
    else
      System.out.println("differ.");
  }

}
