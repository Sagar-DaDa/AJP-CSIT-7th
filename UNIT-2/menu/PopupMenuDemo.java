package menu;

import javax.swing.*;
import java.awt.event.*;

public class PopupMenuDemo {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JPopupMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();

        // Create JMenuItems
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        // Add JMenuItems to the JPopupMenu
        popupMenu.add(cutItem);
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);

        // Create a JTextArea and add a mouse listener for the popup menu
        JTextArea textArea = new JTextArea();
        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        // Add the JTextArea to the frame
        frame.add(textArea);

        // Make the frame visible
        frame.setVisible(true);
    }
}

