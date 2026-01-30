
class MultiThread {
  public static void main(String args[]) {
    Counter c = new Counter();
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 1000000; i++)
        c.incrementCounter();

    });
    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 1000000; i++)
        c.incrementCounter();

    });
    Thread t3 = new Thread(() -> {
      for (int i = 0; i < 1000000; i++)
        c.incrementCounter();

    });

    t1.start();
    t2.start();
    t3.start();

    try {
      t1.join();
      t2.join();
      t3.join();
    } catch (InterruptedException e) {

    }
    c.printCounter();

  }
}
