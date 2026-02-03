import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class showFile {
  public static void main(String args[]) {
    PrintWriter writer = new PrintWriter(System.out, true);

    if (args.length != 2) {
      writer.println("Usage: showFile input_file output_file");
      return;
    }

    int i;
    FileInputStream fin = null;
    FileOutputStream fout = null;

    try {
      fin = new FileInputStream(args[0]);
      fout = new FileOutputStream(args[1]);

      do {
        i = fin.read();
        if (i != -1)
          fout.write(i);
      } while (i != -1);

    } catch (IOException e) {
      System.out.println("I/O Error " + e);
    } finally {
      try {
        if (fin != null && fout != null) {
          fin.close();
          fout.close();
        }
      } catch (IOException e2) {
        System.out.println("Error closing the file ");
      }
    }
    return;
  }
}
