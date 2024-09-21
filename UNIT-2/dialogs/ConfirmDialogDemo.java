package dialogs;

import javax.swing.*;

public class ConfirmDialogDemo {
    public static void main(String[] args) {
        // Create a JFrame as the parent window
        JFrame frame = new JFrame("Confirm Dialog Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Show confirm dialog
        int result = JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);

        // Handle the user's response
        if (result == JOptionPane.YES_OPTION) {
            System.out.println("User selected: Yes");
        } else if (result == JOptionPane.NO_OPTION) {
            System.out.println("User selected: No");
        } else if (result == JOptionPane.CANCEL_OPTION) {
            System.out.println("User selected: Cancel");
        }

        // Close the frame
        frame.setVisible(false);
        frame.dispose();
    }
}

