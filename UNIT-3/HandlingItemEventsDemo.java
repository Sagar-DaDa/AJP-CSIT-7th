import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HandlingItemEventsDemo extends JFrame implements ItemListener {
    JCheckBox checkbox1, checkbox2;
    JLabel label;

    public HandlingItemEventsDemo() {
        setTitle("Handling Item Events");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create checkboxes
        checkbox1 = new JCheckBox("Option 1");
        checkbox2 = new JCheckBox("Option 2");

        // Create label
        label = new JLabel("Select an option");

        // Add checkboxes to the frame
        add(checkbox1);
        add(checkbox2);
        add(label);

        // Register item listeners for the checkboxes
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);

        setVisible(true);
    }

    // Handle item state change event
    public void itemStateChanged(ItemEvent ie) {
        // Check which checkbox triggered the event
        if (ie.getSource() == checkbox1) {
            if (ie.getStateChange() == ItemEvent.SELECTED) {
                label.setText("Option 1 Selected");
            } else {
                label.setText("Option 1 Deselected");
            }
        } else if (ie.getSource() == checkbox2) {
            if (ie.getStateChange() == ItemEvent.SELECTED) {
                label.setText("Option 2 Selected");
            } else {
                label.setText("Option 2 Deselected");
            }
        }
    }

    public static void main(String[] args) {
        new HandlingItemEventsDemo();
    }
}

