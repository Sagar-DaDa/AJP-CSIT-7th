import javax.swing.*;
import java.awt.event.*;   // For ActionListener and ActionEvent

class SameClassEventHandling extends JFrame implements ActionListener {
    JTextField tf;
    JLabel lbl;
    SameClassEventHandling() {
        setLayout(null);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf = new JTextField(15);
        tf.setBounds(60, 50, 170, 20);
        
        lbl = new JLabel("");
        lbl.setBounds(60, 75, 170, 30);

        JButton b = new JButton("Apply");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(this); // Event handling in the same class

        
        add(b); 
        add(tf);
        add(lbl);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        lbl.setText("Hello, " + tf.getText());
    }
    public static void main(String[] args) {
        new SameClassEventHandling();
    }
}
