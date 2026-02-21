import java.net.*;

public class URLDemo {
  public static void main(String args[]) throws Exception {
    URI uri = new URI("http://www.HerbSchildt.com/WhatsNew");
    URL url = uri.toURL();

    System.out.println("Protocol: " + url.getProtocol());
    System.out.println("Port: " + url.getPort());
    System.out.println("File: " + url.getFile());
    System.out.println("Ext: " + url.toExternalForm());

    URLConnection urlc = url.openConnection();
  }
}
