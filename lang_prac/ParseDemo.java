import java.io.*;

class ParseDemo {
  public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str;
    int i;

    do {
      try {
        str = br.readLine();
      } catch (IOException e) {

        str = "";
      }
      try {
        i = Integer.parseInt(str);
      } catch (NumberFormatException e) {
        System.err.println(e);
        i = 0;
      }

    } while (i != 0);

  }
}
