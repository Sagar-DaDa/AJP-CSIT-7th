package menu;

import javax.swing.*;
import java.awt.*;

public class ToolBarDemo extends JFrame {
    
    public ToolBarDemo() {
        // Set frame properties
        setTitle("Toolbar Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a JToolBar with a title
        JToolBar toolBar = new JToolBar("Text formatting", JToolBar.VERTICAL);

        // Create buttons with icons (you need to replace the icon paths with your own images)
        JButton boldButton = new JButton(new ImageIcon("D:\\Teaching\\BKC\\CSIT 7th\\Advanced Java Programming\\Code\\UNIT-2\\menu\\icons\\bold.png"));
        JButton italicButton = new JButton(new ImageIcon("D:\\Teaching\\BKC\\CSIT 7th\\Advanced Java Programming\\Code\\UNIT-2\\menu\\icons\\italic.png"));
        JButton underlineButton = new JButton(new ImageIcon("D:\\Teaching\\BKC\\CSIT 7th\\Advanced Java Programming\\Code\\UNIT-2\\menu\\icons\\underline.png"));

        // Add buttons to the toolbar
        toolBar.add(boldButton);
        toolBar.add(italicButton);
        toolBar.add(underlineButton);

        // Add the toolbar to the frame (at the top, using BorderLayout.NORTH)
        add(toolBar, BorderLayout.NORTH);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new ToolBarDemo();
    }
}

