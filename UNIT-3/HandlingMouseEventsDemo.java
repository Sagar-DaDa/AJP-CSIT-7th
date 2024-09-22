import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class HandlingMouseEventsDemo extends JFrame implements MouseListener {
    int x, y, r1, r2;

    public HandlingMouseEventsDemo() {
        setTitle("Handling Mouse Event");
        addMouseListener(this);  // Register the frame for mouse events
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // This method is called when the mouse is clicked
    public void mouseClicked(MouseEvent me) {
        x = me.getX();  // Get the x-coordinate of the mouse
        y = me.getY();  // Get the y-coordinate of the mouse
        r1 = 60;        // Radius of the oval
        r2 = 40;
        repaint();      // Call repaint to redraw the oval
    }

    public void mousePressed(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {}

    public void mouseReleased(MouseEvent me) {}

    public void mouseExited(MouseEvent me) {}

    // Override paint to draw the oval
    public void paint(Graphics g) {
        g.drawOval(x, y, r1, r2);  // Draw an oval based on the mouse click location
    }

    public static void main(String[] args) {
        new HandlingMouseEventsDemo();
    }
}

