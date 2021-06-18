package MultiThreading;

public class ThreadDemo {

  public static void main(String[] args) {
    NewThread nt = new NewThread("Demo"); // Create a new thread

    nt.t.start(); // Start the thread
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println("Main thread : " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Main Thread Interrupted.");
    }
    System.out.println("Exiting Main thread.");
  }
}
