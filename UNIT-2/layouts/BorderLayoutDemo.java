import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    JButton b1, b2, b3, b4, b5;
    public BorderLayoutDemo() {
        // Set the title and size of the window
        setTitle("BorderLayout Demo");
        setSize(500, 250);
        
        // Set the default close operation to exit the application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout manager
        setLayout(new BorderLayout());

        // Create buttons
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");

        // Add buttons to the respective regions
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);

        // Make the window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        BorderLayoutDemo borderLayoutDemo = new BorderLayoutDemo();
    }
}
