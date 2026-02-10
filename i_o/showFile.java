import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class showFile {
  public static void main(String args[]) {

    PrintWriter writer = new PrintWriter(System.out, true);

    if (args.length != 2) {
      writer.println("Usage: showFile input_file.txt output_file.txt");
      return;
    }
    int i = 0;
    try (FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])) {
      do {
        i = fin.read();
        if (i != -1) {
          writer.println((char) i);
        }
      } while (i != -1);

    } catch (IOException e) {
      System.out.println("I/O Error " + e);
    }

  }
}
