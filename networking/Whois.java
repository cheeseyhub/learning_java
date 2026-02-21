import java.net.*;
import java.io.*;

public class Whois {
  public static void main(String args[]) throws Exception {

    int c;
    try (Socket s = new Socket("en.wikipedia.org", 80)) {

      InputStream in = s.getInputStream();
      OutputStream out = s.getOutputStream();

      String req = "GET /wiki/Java_(programming_language) HTTP/1.0\r\n";
      String Host = "Host: en.wikipedia.org\r\n";

      out.write(req.getBytes());
      out.write(Host.getBytes());
      out.write("\r\n".getBytes());
      out.flush();

      while ((c = in.read()) != -1) {

        System.out.print((char) c);
      }

    }
    ;

  }
}
