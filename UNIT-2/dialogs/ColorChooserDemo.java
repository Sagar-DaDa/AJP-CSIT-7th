package dialogs;

import javax.swing.*;
import java.awt.*;

class ColorChooserDemo extends JFrame {
    JColorChooser colorChooser;
    JPanel panel;

    ColorChooserDemo() {
        // Set frame properties
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Parent Frame");

        // Create a JPanel
        panel = new JPanel();
        add(panel);  // Add the panel to the frame

        // Make the frame visible
        setVisible(true);

        // Create a JColorChooser
        colorChooser = new JColorChooser();

        // Show the color chooser dialog and capture the selected color
        Color color = JColorChooser.showDialog(this, "Select a new color", Color.WHITE);

        // If a color is selected, set the panel's background to the selected color
        if (color != null) {
            panel.setBackground(color);
        }
    }

    public static void main(String[] args) {
        new ColorChooserDemo();
    }
}
