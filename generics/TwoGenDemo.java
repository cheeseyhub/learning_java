public class TwoGenDemo {

  public static void main(String[] args) {
    TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
    tgObj.showTypes();

    int v = tgObj.getobj();
    System.out.println("Value : " + v);

    String str = tgObj.getobj2();
    System.out.println("Value : " + str);

  }
}
