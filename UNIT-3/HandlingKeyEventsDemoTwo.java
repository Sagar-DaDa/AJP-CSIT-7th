import javax.swing.*;
import java.awt.event.*;

public class HandlingKeyEventsDemoTwo extends JFrame implements KeyListener {
    JTextField textField;

    public HandlingKeyEventsDemoTwo() {
        textField = new JTextField(20);
        textField.addKeyListener(this);
        
        add(textField);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new HandlingKeyEventsDemoTwo();
    }
}

