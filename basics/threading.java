public class threading {
  public static void main(String args[]) {
    new implementingRunnable();

    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("Main thread: " + i);
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      System.out.println("Main thread is interrupted");
    }
  }
}
