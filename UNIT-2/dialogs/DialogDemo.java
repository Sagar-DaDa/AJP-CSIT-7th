package dialogs;

import javax.swing.*;
import java.awt.*;

class DialogDemo extends JFrame {
    JLabel label;
    JTextField textField;
    JDialog dialog;

    DialogDemo() {
        // Set frame properties
        setSize(400, 300);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Parent Frame");
        setVisible(true);

        // Create label and text field
        label = new JLabel("Email:");
        textField = new JTextField(15);

        // Create JDialog
        dialog = new JDialog(this, "Dialog Example", true);  // Modal dialog
        dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        dialog.setSize(300, 200);
        dialog.setLocation(50, 50);

        // Add components to dialog
        dialog.add(label);
        dialog.add(textField);

        // Set dialog to visible
        dialog.setVisible(true);
    }

    public static void main(String args[]) {
        // Create instance of DialogDemo (which will display the dialog)
        DialogDemo frame = new DialogDemo();
    }
}

