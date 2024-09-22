import javax.swing.*;
import java.awt.event.*;

class MouseAdapterDemo extends JFrame {
    JTextField tf;
    JLabel lbl;

    MouseAdapterDemo() {
        setLayout(null);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf = new JTextField(15);
        tf.setBounds(60, 50, 170, 20);

        lbl = new JLabel("");
        lbl.setBounds(60, 75, 170, 30);

        JButton b = new JButton("Click Me");
        b.setBounds(100, 120, 80, 30);

        // Using MouseAdapter for mouse events
        b.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                lbl.setText("Button clicked! Hello, " + tf.getText());
            }
        });

        add(b);
        add(tf);
        add(lbl);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}

