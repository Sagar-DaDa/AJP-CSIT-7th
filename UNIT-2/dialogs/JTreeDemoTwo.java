package dialogs;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTreeDemoTwo {
    public static void main(String[] args) {
        // Create a JFrame to hold the JTree
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        DefaultMutableTreeNode[] nodeData = new DefaultMutableTreeNode[]{
            new DefaultMutableTreeNode("Child node1"),
            new DefaultMutableTreeNode("Child node1"),
            new DefaultMutableTreeNode("Child node1")

        };
        
        // Create a JTree using the third constructor (with an Object as root node data)
        JTree tree = new JTree(nodeData);
        
        // Add the tree to the frame inside a JScrollPane for proper scrolling
        frame.add(new JScrollPane(tree), BorderLayout.CENTER);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
