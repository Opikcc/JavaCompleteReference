package MultiThreading;

public class NewThread implements Runnable {
  String name; // Name of Thread
  Thread t;
  
  NewThread(String threadName) {
    name = threadName;
    t = new Thread(this, name);
    System.out.println("New Thread = " + t);
  }
  
  // This is an entry point for the second thread
  public void run() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println("Child thread : " + i);
        Thread.sleep(500);
      }
    }
    catch (InterruptedException e) {
      System.out.println("Child Thread Interrupted.");
    }
    System.out.println("Exiting child thread.");
  }
}
