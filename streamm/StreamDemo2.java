import java.util.ArrayList;
import java.util.stream.*;

public class StreamDemo2 {
  public static void main(String args[]) {
    ArrayList<Double> myList = new ArrayList<>();
    myList.add(7.0);
    myList.add(10.0);
    myList.add(24.0);
    myList.add(99.0);

    double productOfSqrRoots = myList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
    System.out.println("product of square Roots : " + productOfSqrRoots);

    Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));
    sqrtRootStrm.forEach(n -> System.out.print(n));
  }
}
