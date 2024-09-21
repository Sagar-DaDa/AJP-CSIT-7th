package dialogs;

import javax.swing.*;

public class JTableDemo {
    public static void main(String[] args) {
        // Frame initialization
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Table data
        Object[][] data = {
            {"Govind", "Rajbanshi", "CSIT"},
            {"Rohan", "Regmi", "CSIT"},
            {"Utsav", "JR", "CSIT"}
        };

        // Column names
        Object[] columnNames = {"First Name", "Last Name", "Faculty"};

        // Create the JTable
        JTable table = new JTable(data, columnNames);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Set the frame visibility
        frame.setVisible(true);
    }
}

