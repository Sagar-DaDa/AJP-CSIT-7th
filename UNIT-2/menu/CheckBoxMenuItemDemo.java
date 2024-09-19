package menu;

import javax.swing.*;

public class CheckBoxMenuItemDemo {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JCheckBoxMenuItem Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu
        JMenu optionsMenu = new JMenu("Options");

        // Create JCheckBoxMenuItems
        JCheckBoxMenuItem soundItem = new JCheckBoxMenuItem("Sound");
        JCheckBoxMenuItem musicItem = new JCheckBoxMenuItem("Music", true); // Initially checked
        JCheckBoxMenuItem notificationsItem = new JCheckBoxMenuItem("Notifications", false); // Initially unchecked

        // Add JCheckBoxMenuItems to the JMenu
        optionsMenu.add(soundItem);
        optionsMenu.add(musicItem);
        optionsMenu.add(notificationsItem);

        // Add the JMenu to the JMenuBar
        menuBar.add(optionsMenu);

        // Set the JMenuBar to the JFrame
        frame.setJMenuBar(menuBar);

        // Make the frame visible
        frame.setVisible(true);
    }
}
