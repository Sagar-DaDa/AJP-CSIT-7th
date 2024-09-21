package dialogs;

import javax.swing.*;

public class OptionDialogDemo {
    public static void main(String[] args) {
        // Create a JFrame as the parent window
        JFrame frame = new JFrame("Option Dialog Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        // Custom options for the dialog
        Object[] options = {"Yes Please", "No way!!"};
        
        // Show option dialog
        int result = JOptionPane.showOptionDialog(
            frame, 
            "Do you like coding in Java?", 
            "Question", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.PLAIN_MESSAGE, 
            null, 
            options, 
            options[0]
        );
        
        // Handle user response
        if (result == JOptionPane.YES_OPTION) {
            System.out.println("User selected: Yes Please");
        } else if (result == JOptionPane.NO_OPTION) {
            System.out.println("User selected: No way!!");
        }
        
        // Close the frame
        frame.setVisible(false);
        frame.dispose();
    }
}

