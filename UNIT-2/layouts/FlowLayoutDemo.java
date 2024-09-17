import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    public FlowLayoutDemo() {
        // Set the title and size of the window
        setTitle("FlowLayout Demo");
        setSize(400, 150);
        
        // Set the default close operation to exit the application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout manager
        setLayout(new FlowLayout(FlowLayout.LEFT));

        // Add components
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));
        add(new JButton("Button 6"));
        add(new JButton("This is Larger Button"));

        // Make the window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        FlowLayoutDemo flowLayoutDemo = new FlowLayoutDemo();
    }
}
