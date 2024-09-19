package Tasks;

import javax.swing.*;
import java.awt.*;

public class SimpleLoginUISwing extends JFrame{
    private JFrame frame;
    private JLabel titleLabel, userLabel, passLabel, copyLabel;
    private JTextField userText;
    private JPasswordField passText;
    private JCheckBox rememberCheckBox;
    private JButton loginButton;

    SimpleLoginUISwing(){
        loginFrame().setVisible(true);
    }

    private JFrame loginFrame(){
        //Configuring frame
        frame = new JFrame();
        frame.setTitle("Please Login");
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //Configuring label for the title
        titleLabel = new JLabel("Please Login", JLabel.CENTER);
        titleLabel.setFont(new Font(null, Font.BOLD, 25));
        titleLabel.setBounds(0, 50, 450, 50);
        frame.add(titleLabel);

        //Configuring username label and text field
        userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        userLabel.setBounds(70, 120, 300, 35);
        frame.add(userLabel);

        userText = new JTextField();
        userText.setBounds(70, 150, 300, 35);
        frame.add(userText);

        //Configuring password label and password field
        passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passLabel.setBounds(70, 190, 300, 35);
        frame.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(70, 220, 300, 35);
        frame.add(passText);

        //Configuring rember me checkbox
        rememberCheckBox = new JCheckBox("Remeber me.");
        rememberCheckBox.setBounds(70, 255, 300, 35);
        frame.add(rememberCheckBox);

        //Configuring login button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 18));
        loginButton.setBounds(125, 310, 200, 40);
        frame.add(loginButton);

        //Configuring copyright label
        copyLabel = new JLabel("© Login Page | 2024.", JLabel.CENTER);
        copyLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        copyLabel.setBounds(70, 400, 300, 30);
        frame.add(copyLabel);

        return frame;
    }
    public static void main(String[] args) {
        new SimpleLoginUISwing();        
    }
}

