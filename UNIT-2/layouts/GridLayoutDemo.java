import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    JButton b1, b2, b3, b4, b5;
    public GridLayoutDemo() {
        // Set the title and size of the window
        setTitle("GridLayout Demo");
        setSize(400, 200);

        // Set the default close operation to exit the application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout manager
        setLayout(new GridLayout(0, 3)); // 0 rows, 3 columns

        // Create buttons
        b1 = new JButton("Button 1");
        b2 = new JButton("This is Long Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");

        // Add buttons to the frame
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        // Make the window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
