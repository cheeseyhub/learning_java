
class NewThread implements Runnable {

  Counter c;

  NewThread(Counter counter) {
    c = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 100000; i++) {
      c.incrementCounter();

    }

  }
}
