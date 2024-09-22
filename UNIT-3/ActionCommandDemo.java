import javax.swing.*;
import java.awt.event.*;

class ActionCommandDemo extends JFrame implements ActionListener {
    JLabel lb;

    ActionCommandDemo() {
        setLayout(null);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lb = new JLabel();
        lb.setBounds(60, 50, 170, 20);
        
        JButton b1 = new JButton("continue");
        b1.setBounds(50, 120, 85, 30);
        
        JButton b2 = new JButton("Ok");
        b2.setBounds(140, 120, 80, 30);
        
        add(lb);
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        // Assigning the same action command to both buttons
        b1.setActionCommand("proceed");
        b2.setActionCommand("proceed");
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Check if the action command is "proceed"
        if (e.getActionCommand().equals("proceed")) {
            lb.setText("Do you want to proceed???");
        }
    }

    public static void main(String[] args) {
        new ActionCommandDemo();
    }
}
