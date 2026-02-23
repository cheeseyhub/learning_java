import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.*;

class HttpURLDemo {
  public static void main(String args[]) throws Exception {

    URL url = new URI("https://www.google.com").toURL();
    HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
    System.out.println("Protocol: " + urlCon.getResponseCode());
    System.out.println("Content-Type: " + urlCon.getContentType());
    System.out.println("Message: " + urlCon.getResponseMessage());
    BufferedInputStream input = new BufferedInputStream(urlCon.getInputStream());

    PrintWriter writer = new PrintWriter(System.out, true);

    int c;
    while ((c = input.read()) != -1) {
      writer.write(c);
    }

    input.close();

  }
}
