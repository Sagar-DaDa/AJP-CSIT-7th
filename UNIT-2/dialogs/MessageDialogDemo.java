package dialogs;

import javax.swing.*;

public class MessageDialogDemo {
    public static void main(String[] args) {
        // Create a JFrame as the parent window
        JFrame frame = new JFrame("Message Dialog Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        // Show message dialog
        JOptionPane.showMessageDialog(frame, "Please accept terms & conditions", "Terms & Conditions", JOptionPane.INFORMATION_MESSAGE);
        
        // Close the frame after showing the message dialog
        frame.setVisible(false);
        frame.dispose();
    }
}

