import javax.swing.*;
import java.awt.event.*;

class MouseAdapterDemoTwo extends JFrame {
    JTextField tf;
    JLabel lbl;

    MouseAdapterDemoTwo() {
        setLayout(null);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf = new JTextField(15);
        tf.setBounds(60, 50, 170, 20);

        lbl = new JLabel("");
        lbl.setBounds(60, 75, 170, 30);

        JButton b = new JButton("Apply");
        b.setBounds(100, 120, 80, 30);

        // Use KeyAdapter instead of ActionListener for button events
        b.addMouseListener(new ButtonActionAdapter());

        add(b);
        add(tf);
        add(lbl);

        setVisible(true);
    }

    // Adapter class extending MouseAdapter
    private class ButtonActionAdapter extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            lbl.setText("Hello, " + tf.getText());
        }
    }

    public static void main(String[] args) {
        new MouseAdapterDemoTwo();
    }
}

