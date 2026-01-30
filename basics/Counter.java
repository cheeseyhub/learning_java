class Counter {
  private int counter = 0;

  public synchronized void incrementCounter() {
    counter++;
  }

  public void printCounter() {
    System.out.println(counter);
  }
}
