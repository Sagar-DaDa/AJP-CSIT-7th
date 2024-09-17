import java.awt.*;
import javax.swing.*;

public class GridBagDemo extends JFrame {
    // Declare components at the class level
    private JButton b1, b2, b3, b4, b5;
    private GridBagConstraints gbc;

    // Constructor to set up the GUI
    public GridBagDemo() {
        // Set the title and size of the window
        setTitle("GridBag Layout Demo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout manager
        setLayout(new GridBagLayout());

        // Initialize GridBagConstraints
        gbc = new GridBagConstraints();
        
        // Initialize buttons
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("This is Long Button 4");
        b5 = new JButton("Button 5");
        
        // Configure and add Button 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        gbc.weighty = 0.0;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(b1, gbc);
        
        // Configure and add Button 2
        gbc.gridx = 1;
        add(b2, gbc);
        
        // Configure and add Button 3
        gbc.gridx = 2;
        add(b3, gbc);
        
        // Configure and add Button 4
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.ipady = 40;
        add(b4, gbc);
        
        // Configure and add Button 5
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.ipady = 20;
        add(b5, gbc);

        // Make the window visible
        setVisible(true);
    }

    // Main method to create and display the GUI
    public static void main(String[] args) {
        new GridBagDemo();
    }
}
