public class enumeration {
  enum Apple {
    Jonathan, GoldenDel, RedDel
  }

  public static void main(String args[]) {

    Apple al[] = Apple.values();

    for (Apple a : al) {
      System.out.println(a);
    }
  }
}
