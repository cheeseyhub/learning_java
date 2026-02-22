import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class SwingDemo3 {
  JTextField jtf;

  SwingDemo3() {
    JFrame jfrm = new JFrame("Testing out the input Frame");
    jfrm.setSize(500, 500);
    jfrm.setLayout(new FlowLayout());
    jtf = new JTextField(15);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.add(jtf);
    jfrm.setVisible(true);

  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new SwingDemo3();
      }
    });

  }
}
