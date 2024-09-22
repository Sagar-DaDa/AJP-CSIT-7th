import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HandlingFocusEventsDemoTwo extends JFrame implements FocusListener {
    private JTextField t1, t2, t3;
    private JLabel l1, l2, l3;
    private JButton b;

    public HandlingFocusEventsDemoTwo() {
        super("Handling Focus Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("First Value:");
        l2 = new JLabel("Second Value:");
        l3 = new JLabel("Result:");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        b = new JButton("Multiply");

        // Add focus listeners
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        t3.addFocusListener(this);
        b.addFocusListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);

        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent fe) {
        if (fe.getSource() == t3) {
            try {
                int x = Integer.parseInt(t1.getText());
                int y = Integer.parseInt(t2.getText());
                int z = x * y;
                t3.setText(String.valueOf(z));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Enter valid numbers to multiply");
            }
        }
    }

    @Override
    public void focusLost(FocusEvent fe) {
        if (fe.getSource() == t1 && t1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter number to continue");
            t1.requestFocus();
        } else if (fe.getSource() == t2 && t2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter number to continue");
            t2.requestFocus();
        }
    }

    public static void main(String[] args) {
        new HandlingFocusEventsDemoTwo();
    }
}

