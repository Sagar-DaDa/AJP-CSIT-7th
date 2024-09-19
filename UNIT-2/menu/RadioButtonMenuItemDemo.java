package menu;

import javax.swing.*;

public class RadioButtonMenuItemDemo {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JRadioButtonMenuItem Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu
        JMenu viewMenu = new JMenu("View");

        // Create JRadioButtonMenuItems
        JRadioButtonMenuItem lightModeItem = new JRadioButtonMenuItem("Light Mode");
        JRadioButtonMenuItem darkModeItem = new JRadioButtonMenuItem("Dark Mode", true); // Initially selected

        // Group the radio button menu items so only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(lightModeItem);
        group.add(darkModeItem);

        // Add JRadioButtonMenuItems to the JMenu
        viewMenu.add(lightModeItem);
        viewMenu.add(darkModeItem);

        // Add the JMenu to the JMenuBar
        menuBar.add(viewMenu);

        // Set the JMenuBar to the JFrame
        frame.setJMenuBar(menuBar);

        // Make the frame visible
        frame.setVisible(true);
    }
}
