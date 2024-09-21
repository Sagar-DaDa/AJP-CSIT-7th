package dialogs;

import javax.swing.*;

public class OptionDialogWithInput {
    public static void main(String[] args) {
        // Create a JFrame as the parent window
        JFrame frame = new JFrame("Option with Input Dialog Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        // Custom options for the option dialog
        Object[] options = {"Yes Please", "No way!!"};
        
        // Show option dialog
        int optionResult = JOptionPane.showOptionDialog(
            frame, 
            "Do you like coding in Java?", 
            "Choose Option", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
        
        // Handle user response from option dialog
        if (optionResult == JOptionPane.NO_OPTION) {
            // If "No" is selected, show input dialog
            String input = JOptionPane.showInputDialog(frame, "Which programming language do you prefer?:", "Input Dialog", JOptionPane.PLAIN_MESSAGE);
            
            // Check if user entered something or cancelled
            if (input != null) {
                JOptionPane.showMessageDialog(frame, "You entered: " + input, "Input Received", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "No input received!", "No Input", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            // If "Yes" is selected
            JOptionPane.showMessageDialog(frame, "Thank you!", "Confirmed", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Close the frame
        frame.setVisible(false);
        frame.dispose();
    }
}

