import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HandlingKeyEventsDemo extends JFrame implements KeyListener {
    private JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b;

    public HandlingKeyEventsDemo() {
        super("Handling Key Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("First Value:");
        l2 = new JLabel("Second Value:");
        l3 = new JLabel("Result:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false); // Make result field non-editable

        b = new JButton("Calculate");
        b.addKeyListener(this);

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

        // Add KeyListener to the frame to capture key events
        addKeyListener(this);
        t1.requestFocus(); // Focus on the first text field by default
    }

    public void keyPressed(KeyEvent ke) {
        int x, y, z;
        try {
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());
        } catch (NumberFormatException e) {
            t3.setText("Enter valid numbers");
            return;
        }

        if (ke.getKeyChar() == 'a') {
            z = x + y;
            t3.setText("Result: " + z);
        } else if (ke.getKeyChar() == 's') {
            z = x - y;
            t3.setText("Result: " + z);
        } else {
            t3.setText("Press 'a' for addition or 's' for subtraction");
        }
    }

    public void keyTyped(KeyEvent ke) {
        // Not used
    }

    public void keyReleased(KeyEvent ke) {
        // Not used
    }

    public static void main(String[] args) {
        new HandlingKeyEventsDemo();
    }
}
