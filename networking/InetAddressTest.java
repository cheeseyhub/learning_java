import java.net.*;

public class InetAddressTest {

  public static void main(String[] args) throws UnknownHostException {

    InetAddress Address = InetAddress.getLocalHost();
    System.out.println(Address);

    Address = InetAddress.getByName("www.google.com");
    System.out.println(Address);

    InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
    for (InetAddress a : SW) {
      System.out.println(a);
    }

  }
}
