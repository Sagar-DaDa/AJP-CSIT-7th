package layouts;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    public BorderLayoutDemo() {
        // Set the title and size of the window
        setTitle("BorderLayout Demo");
        setSize(500, 250);
        
        // Set the default close operation to exit the application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout manager
        setLayout(new BorderLayout());

        // Create buttons
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");

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
        // Create and display the frame on the Event Dispatch Thread
        SwingUtilities.invokeLater(BorderLayoutDemo::new);
    }
}
