import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class SwingDemo {
  JLabel jlab;

  SwingDemo() {
    JFrame jfr = new JFrame("An Event example");
    jfr.setLayout(new FlowLayout());
    jfr.setSize(220, 90);
    jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton jbtnAlpha = new JButton("Alpha");
    JButton jbtnBeta = new JButton("Beta");

    jbtnAlpha.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        jlab.setText("Alpha was pressed.");
      }
    });
    jbtnBeta.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        jlab.setText("Beta was pressed");
      }
    });
    jfr.add(jbtnAlpha);
    jfr.add(jbtnBeta);

    jlab = new JLabel("Press a button");
    jfr.add(jlab);
    jfr.setVisible(true);

  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new SwingDemo();
      }
    });
  }
}
