import javax.swing.*;
import java.awt.*;

public class BorderDemo extends JFrame {

    public BorderDemo() {
        setTitle("Border Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Root panel with padding
        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayout(7, 1, 0, 10)); // Grid layout with spacing between rows
        rootPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Padding for root container
        rootPanel.setBackground(Color.LIGHT_GRAY);

        // JPanel for each type of border
        JPanel raisedBevelPanel = createPanel("Raised Bevel Border");
        raisedBevelPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        raisedBevelPanel.setBackground(Color.LIGHT_GRAY);

        JPanel loweredBevelPanel = createPanel("Lowered Bevel Border");
        loweredBevelPanel.setBorder(BorderFactory.createLoweredBevelBorder());
        loweredBevelPanel.setBackground(Color.LIGHT_GRAY);

        JPanel lineBorderPanel = createPanel("Line Border");
        lineBorderPanel.setBorder(BorderFactory.createLineBorder(Color.black, 3));

        JPanel etchedBorderPanel = createPanel("Etched Border");
        etchedBorderPanel.setBorder(BorderFactory.createEtchedBorder());

        JPanel titledBorderPanel = createPanel("Titled Border");
        titledBorderPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),"Border Title"));
        titledBorderPanel.setBackground(Color.LIGHT_GRAY);

        Icon icon = new ImageIcon("globe.png");
        JPanel matteBorderPanel = createPanel("Matte Border with Icon");
        matteBorderPanel.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, icon));

        JPanel compoundBorderPanel = createPanel("Compound Border");
        compoundBorderPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.blue, 3),
                BorderFactory.createLoweredBevelBorder()
        ));

        // Add panels to the root panel
        rootPanel.add(raisedBevelPanel);
        rootPanel.add(loweredBevelPanel);
        rootPanel.add(lineBorderPanel);
        rootPanel.add(etchedBorderPanel);
        rootPanel.add(titledBorderPanel);
        rootPanel.add(matteBorderPanel);
        rootPanel.add(compoundBorderPanel);

        // Add root panel to the frame
        add(rootPanel);

        // Set the frame size and make it visible
        setSize(500, 900);
        setVisible(true);
    }

    // Helper method to create panels with a label and add padding
    private JPanel createPanel(String labelText) {
        JPanel panel = new JPanel();
        panel.add(new JLabel(labelText));

        // Add padding inside each panel using EmptyBorder
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BorderDemo());
    }
}
