import java.util.*;
import java.util.stream.*;

public class StreamDemo {
  public static void main(String args[]) {
    Consumer<String> printWithSpace = name -> System.out.print(name + " ");
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(88);
    myList.add(7);
    myList.add(9);
    myList.add(19283);
    myList.add(8);
    myList.add(92384);
    myList.add(33435);

    System.out.println("Original List : " + myList);

    Stream<Integer> myStream = myList.stream();
    Optional<Integer> minVal = myStream.min(Integer::compare);
    if (minVal.isPresent()) {
      System.out.println("The min value in the list is " + minVal.get());
    }

    myStream = myList.stream();
    Optional<Integer> maxVal = myStream.max(Integer::compare);
    if (maxVal.isPresent()) {
      System.out.println("The max value in the list is " + maxVal.get());
    }

    Stream<Integer> sortedStream = myList.stream().sorted();
    sortedStream.forEach((n) -> System.out.print(n + " "));
    System.out.println();

    Stream<Integer> oddvals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
    oddvals.forEach((n) -> System.out.print(n + " "));
    System.out.println();

    oddvals = myList.stream().filter(n -> (n % 2) == 1).filter(n -> n > 8);
    System.out.print("Odd values greater than 5 :");
    oddvals.forEach((n) -> System.out.print(n + " "));
    System.out.println();

  }
}
