package dialogs;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo extends JFrame {
    public JTreeDemo() {
        // Creating the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Creating child nodes
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");

        // Adding child nodes to the root node
        root.add(node1);
        root.add(node2);

        // Creating the tree by passing the root node
        JTree tree = new JTree(root);

        // Adding the tree to a JScrollPane for display
        JScrollPane treeView = new JScrollPane(tree);

        // Setting up the frame
        add(treeView);
        setTitle("JTree Example");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTreeDemo();
    }
}


