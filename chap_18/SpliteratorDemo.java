import java.util.*;

public class SpliteratorDemo {
  public static void main(String args[]) {
    ArrayList<Double> vals = new ArrayList<>();

    vals.add(1.0);
    vals.add(2.0);
    vals.add(3.0);
    vals.add(4.0);
    vals.add(5.0);
    vals.add(6.0);

    System.out.println("Contents of  vals: \n");

    Spliterator<Double> spltitr = vals.spliterator();

    while (spltitr.tryAdvance(System.out::println))
      ;
    System.out.println();

  }
}
