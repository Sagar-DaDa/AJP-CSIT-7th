package dialogs;

import javax.swing.*;

public class InputDialogDemo {
    public static void main(String[] args) {
        // Create a JFrame as the parent window
        JFrame frame = new JFrame("Input Dialog Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Show input dialog and capture user input
        String input = JOptionPane.showInputDialog(frame, "Enter your e-mail", "someone@example.com");

        // Display the entered input (if user didn't cancel)
        if (input != null) {
            JOptionPane.showMessageDialog(frame, "You entered: " + input, "Input Result", JOptionPane.INFORMATION_MESSAGE);
        }

        // Close the frame
        frame.setVisible(false);
        frame.dispose();
    }
}

