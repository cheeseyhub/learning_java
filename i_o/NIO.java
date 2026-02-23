import java.util.List;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.nio.file.Paths;

public class NIO {
  public static void main(String args[]) {
    try {
      Path path = Paths.get("./showFile.java");
      List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
      lines.forEach(System.out::println);

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
