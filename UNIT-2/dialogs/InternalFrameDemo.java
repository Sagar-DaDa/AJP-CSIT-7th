package dialogs;

import javax.swing.*;
import java.awt.*;

class InternalFrameDemo extends JFrame {
    JDesktopPane dp; // Desktop pane to hold internal frames
    JInternalFrame iframe; // Internal frame
    JTextField tb; // Text field
    JLabel lb; // Label

    InternalFrameDemo() {
        // Set frame properties
        setSize(400, 300);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a desktop pane
        dp = new JDesktopPane();

        // Create an internal frame
        iframe = new JInternalFrame("Internal Frame", true, true, true, true);
        iframe.setSize(200, 200); // Set size
        iframe.setLocation(50, 50); // Set location

        // Create label and text field
        lb = new JLabel("Email");
        tb = new JTextField(10);

        // Set layout for the internal frame and add components
        iframe.setLayout(new FlowLayout(FlowLayout.CENTER));
        iframe.add(lb);
        iframe.add(tb);
        iframe.setVisible(true); // Make internal frame visible

        // Add the internal frame to the desktop pane and the desktop pane to the main frame
        dp.add(iframe);
        add(dp);

        // Make the main frame visible
        setVisible(true);
    }

    public static void main(String args[]) {
        InternalFrameDemo frame = new InternalFrameDemo();
    }
}
