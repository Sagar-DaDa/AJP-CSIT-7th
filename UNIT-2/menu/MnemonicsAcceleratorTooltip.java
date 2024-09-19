package menu;

import javax.swing.*;
import java.awt.event.*;

public class MnemonicsAcceleratorTooltip extends JFrame {

    public MnemonicsAcceleratorTooltip() {
        // Set frame properties
        setSize(400, 300);
        setTitle("Menu Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create JMenu items
        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");
        JMenu editMenu = new JMenu("Edit");
        JMenu zoomMenu = new JMenu("Zoom");

        // Set Mnemonics for menus (Alt+F, Alt+V, etc.)
        fileMenu.setMnemonic('F');
        viewMenu.setMnemonic('V');
        editMenu.setMnemonic('E');
        zoomMenu.setMnemonic('Z');

        // Create JMenuItems with Mnemonics and Accelerators
        JMenuItem miOpen = new JMenuItem("Open");
        miOpen.setMnemonic('O'); // Alt+O for Open
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK)); // Ctrl+O shortcut
        miOpen.setToolTipText("Open a file");

        JMenuItem miSave = new JMenuItem("Save");
        miSave.setMnemonic('S'); // Alt+S for Save
        miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK)); // Ctrl+S shortcut
        miSave.setToolTipText("Save a file");

        // Create a JCheckBoxMenuItem
        JCheckBoxMenuItem miStatusBar = new JCheckBoxMenuItem("Status Bar", false);
        miStatusBar.setMnemonic('T'); // Alt+T for Status Bar
        miStatusBar.setToolTipText("Toggle the status bar");

        // Add JMenuItems to the File and View menus
        fileMenu.add(miOpen);
        fileMenu.add(miSave);
        viewMenu.add(miStatusBar);
        viewMenu.add(zoomMenu);

        // Add Menus to the JMenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        // Set the JMenuBar to the JFrame
        setJMenuBar(menuBar);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new MnemonicsAcceleratorTooltip();
    }
}

