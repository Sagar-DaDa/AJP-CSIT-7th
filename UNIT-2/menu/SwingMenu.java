package menu;
import javax.swing.*;

public class SwingMenu {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JMenuItem Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu
        JMenu fileMenu = new JMenu("File");

        // Create JMenuItems using different constructors
        JMenuItem newItem = new JMenuItem("New", new ImageIcon("D:\\Teaching\\BKC\\CSIT 7th\\Advanced Java Programming\\Code\\UNIT-2\\menu\\icons\\new.png"));
        JMenuItem openItem = new JMenuItem("Open");
        openItem.setIcon(new ImageIcon("D:\\Teaching\\BKC\\CSIT 7th\\Advanced Java Programming\\Code\\UNIT-2\\menu\\icons\\open.png"));
        JMenuItem saveItem = new JMenuItem("Save", new ImageIcon("D:\\Teaching\\BKC\\CSIT 7th\\Advanced Java Programming\\Code\\UNIT-2\\menu\\icons\\save.png")); // With an icon
        JMenuItem exitItem = new JMenuItem("Exit", 'E'); // With mnemonic 'E'
        exitItem.setIcon(new ImageIcon("D:\\Teaching\\BKC\\CSIT 7th\\Advanced Java Programming\\Code\\UNIT-2\\menu\\icons\\exit.png"));

        // Add JMenuItems to the JMenu
        fileMenu.setSize(150,5);
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Add the JMenu to the JMenuBar
        menuBar.add(fileMenu);

        // Set the JMenuBar to the JFrame
        frame.setJMenuBar(menuBar);

        // Make the frame visible
        frame.setVisible(true);
    }
}
