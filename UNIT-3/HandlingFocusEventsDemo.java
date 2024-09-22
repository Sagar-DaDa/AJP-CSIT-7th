import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HandlingFocusEventsDemo extends JFrame implements FocusListener {
    private JTextField textField1, textField2;
    private JLabel label;

    public HandlingFocusEventsDemo() {
        super("Focus Event Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        label = new JLabel("Focus on a text field");

        // Register focus listeners
        textField1.addFocusListener(this);
        textField2.addFocusListener(this);

        add(textField1);
        add(textField2);
        add(label);

        setSize(300, 150);
        setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == textField1) {
            label.setText("TextField 1 gained focus");
            System.out.println("TextField 1 gained focus");
        } else if (e.getSource() == textField2) {
            label.setText("TextField 2 gained focus");
            System.out.println("TextField 2 gained focus");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == textField1) {
            label.setText("TextField 1 lost focus");
            System.out.println("TextField 1 lost focus");
        } else if (e.getSource() == textField2) {
            label.setText("TextField 2 lost focus");
            System.out.println("TextField 2 lost focus");
        }
    }

    public static void main(String[] args) {
        new HandlingFocusEventsDemo();
    }
}

