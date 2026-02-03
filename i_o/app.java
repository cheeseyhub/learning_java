import java.io.*;

public class app {
  public static void main(String args[]) {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    String str[] = new String[100];
    System.out.println("Please Enter lines of text ");

    System.out.println("Please enter stop to print ");

    try {
      for (int i = 0; i < 100; i++) {
        str[i] = r.readLine();
        if (str[i].equals("stop"))
          break;
      }
    } catch (IOException e) {
      System.out.println("Error reading the input");

    }
    System.out.println("\nHere is your file ");

    for (int i = 0; i < 100; i++) {
      if (str[i].equals("stop"))
        break;
      System.out.println(str[i]);
    }
  }
}
