import javax.swing.*;

public class NoLayoutDemo {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("NoLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Disable layout manager

        // Create and configure components
        JLabel label = new JLabel("First Name:");
        label.setBounds(30, 50, 100, 20); // Set position and size
        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 100, 20); // Set position and size

        // Add components to the frame
        frame.add(label);
        frame.add(textField);

        // Set frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
