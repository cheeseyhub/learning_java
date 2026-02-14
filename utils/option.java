import java.util.Optional;

public class option {
  public static void main(String args[]) {
    Optional<String> noVal = Optional.empty();
    Optional<String> hasVal = Optional.of("This is something.");

    if (noVal.isPresent()) {
      System.out.println("There is no value present. in no present ");
    }

    if (noVal.isEmpty()) {
      System.out.println("no val is : This is actually empty.");
    }

  }
}
