import java.util.Random;

class Bulb {
  private String brand;
  private double wattage;
  private String color;
  private boolean state;

  public Bulb() {
    state = false;
    brand = "N/A";
    wattage = 0.0;
    color = "N/A";
  }

  public Bulb(String bran, double watt, String colr, boolean st) {
    brand = bran;
    wattage = watt;
    color = colr;
    state = st;
  }

  public void showStatus() {
    if (state) {
      System.out.println("Bulb is On");
    } else {
      System.out.println("Bulb is off");
    }
  }

  public boolean getStatus() {
    return state;
  }

  public void setStatus(boolean newState) {
    state = newState;
  }

  public void turnOn() {
    setStatus(true);
  }

  public void turnOff() {
    setStatus(false);
  }

  public void toggle() {
    if (getStatus()) {
      turnOff();
    } else {
      turnOn();
    }
  }
}

public class BulbDemo {
  public static void main(String[] args) {
    Bulb[] arrayOfBulbs = new Bulb[10];
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      arrayOfBulbs[i] = new Bulb("Philips", r.nextFloat(), "Orange", r.nextBoolean());
    }

    System.out.println("These are the status of all the bulbs");

    for (Bulb b : arrayOfBulbs)
      b.showStatus();

    int BulbsThatAreOn = 0;
    int BulbsThatAreOff = 0;
    for (Bulb b : arrayOfBulbs) {
      if (b.getStatus()) {
        BulbsThatAreOn++;
      } else {
        BulbsThatAreOff++;

      }
    }

    System.out.print("[ ");
    for (int i = 0; i < 10; i++) {
      if (arrayOfBulbs[i].getStatus()) {
        System.out.print(i + ", ");
      }

    }
    System.out.print(" ]");

    System.out.println();
    for (Bulb b : arrayOfBulbs) {
      b.toggle();
    }

    System.out.print("[ ");
    for (int i = 0; i < 10; i++) {
      if (arrayOfBulbs[i].getStatus()) {
        System.out.print(i + ", ");
      }

    }
    System.out.print(" ]");

    System.out.println();

    // On bulbs percentage;
    double percentage = (BulbsThatAreOn / 10.0) * 100;
    System.out.println(percentage);
  }
}
