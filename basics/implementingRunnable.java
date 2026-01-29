public class implementingRunnable implements Runnable {
  Thread t;

  implementingRunnable() {

    t = new Thread(this, "Demo thread");
    System.out.println("Child thread ");
    t.start();

  }

  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("Child thread : " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Child interrupted");
    }
    System.out.println("Exiting child thread;");

  }
}
