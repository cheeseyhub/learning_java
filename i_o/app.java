import java.io.*;

public class app {
  public static void main(String args[]) {
    String c;
    System.out.println("This is a line ");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      c = br.readLine();
      System.out.println(c);
    } catch (IOException e) {
      System.out.println("Could not read the stream.");
    }

  }
}
