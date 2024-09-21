package dialogs;

import javax.swing.*;
import java.awt.*;
import java.io.File;

class FileChooserDemo extends JFrame {
    JFileChooser fileChooser;

    FileChooserDemo() {
        // Set frame properties
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Parent Frame");
        setLayout(new FlowLayout());  // Set layout

        // Create a JFileChooser
        fileChooser = new JFileChooser();
        
        // Assigning custom path
        // fileChooser.setCurrentDirectory(new File("D:\\"));

        // Show the open dialog
        int returnValue = fileChooser.showOpenDialog(this);

        // Check if a file was selected
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new FileChooserDemo();
    }
}
