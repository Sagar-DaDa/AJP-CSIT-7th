package menu;

import javax.swing.*;

public class EnableDisableMenu extends JFrame {

    public EnableDisableMenu() {
        // Set frame properties
        setSize(400, 300);
        setTitle("Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create JMenu items
        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");

        // Set Mnemonics for menus (Alt+F for File)
        fileMenu.setMnemonic('F');
        viewMenu.setMnemonic('V');

        // Add menus to the JMenuBar
        menuBar.add(fileMenu);
        menuBar.add(viewMenu);

        // Create JMenuItems
        JMenuItem miOpen = new JMenuItem("Open");
        JMenuItem miSave = new JMenuItem("Save");

        // Add JMenuItems to the File menu
        fileMenu.add(miOpen);
        fileMenu.add(miSave);

        // Disable the "Save" menu item
        miSave.setEnabled(false); // Disable the Save item

        // Set the JMenuBar to the JFrame
        setJMenuBar(menuBar);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new EnableDisableMenu();
    }
}
