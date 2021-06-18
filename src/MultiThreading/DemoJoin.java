package MultiThreading;

public class DemoJoin {
  public static void main(String[] args) {
    NewThread nt1 = new NewThread("One");
    NewThread nt2 = new NewThread("Two");
    NewThread nt3 = new NewThread("Three");
    
    // Start the Threads
    nt1.t.start();
    nt2.t.start();
    nt3.t.start();
    
    System.out.println("Thread one is alive : "   + nt1.t.isAlive());
    System.out.println("Thread two is alive : "   + nt2.t.isAlive());
    System.out.println("Thread three is alive : " + nt3.t.isAlive());
    try {
      System.out.println("Waiting for threads to finish.");
      nt1.t.join();
      nt2.t.join();
      nt3.t.join();
    }
    catch (InterruptedException e) {
      System.out.println("Main Thread Interrupted.");
    }
    
    System.out.println("Thread one is alive : "   + nt1.t.isAlive());
    System.out.println("Thread two is alive : "   + nt2.t.isAlive());
    System.out.println("Thread three is alive : " + nt3.t.isAlive());
    
    System.out.println("Main Thread Exiting");
  }
}
