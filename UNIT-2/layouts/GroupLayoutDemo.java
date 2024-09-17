import javax.swing.*;
import java.awt.*;

public class GroupLayoutDemo extends JFrame {
    // Declare components at the class level
    private JButton b1, b2, b3, b4;
    private JPanel panel;
    private GroupLayout groupLayout;

    public GroupLayoutDemo() {
        // Set the size, title, and default close operation
        setSize(400, 250);
        setTitle("Group Layout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set up the panel with GroupLayout
        panel = new JPanel();
        groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);
        panel.setBackground(Color.GRAY);
        add(panel);

        // Initialize buttons
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");

        // Define horizontal and vertical groups
        groupLayout.setHorizontalGroup(
            groupLayout.createSequentialGroup()
                .addComponent(b1)
                .addComponent(b2)
                .addGroup(groupLayout.createParallelGroup()
                    .addComponent(b3)
                    .addComponent(b4))
        );

        groupLayout.setVerticalGroup(
            groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup()
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3))
                .addComponent(b4)
        );

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new GroupLayoutDemo();
    }
}
