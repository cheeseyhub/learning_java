package stack_dir;

public class Stack {
  private int[] stack = new int[100];
  private int tos;

  public Stack() {
    tos = -1;
  }

  public synchronized void push(int item) {
    if (tos == 100) {
      System.out.println("Stack is full");
    } else {
      stack[++tos] = item;
    }
  }

  public int pop() {
    if (tos < 0) {
      System.out.println("Stack underflow");
      return 0;
    } else {
      return stack[tos--];
    }
  }

  int peek() {
    return stack[tos];
  }

  public void printStack() {
    for (int i : this.stack) {
      System.out.printf(" %d ,  ", i);

    }
  }
}
