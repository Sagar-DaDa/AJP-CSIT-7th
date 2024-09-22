import javax.swing.JFrame;
import java.awt.event.*;

public class HandlingWindowEventsDemo extends JFrame {

    public HandlingWindowEventsDemo() {
        setTitle("Handling Window Events");
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a WindowAdapter to handle window events
        addWindowListener(new WindowAdapter() {
            // Override windowClosing to handle the window closing event
            public void windowClosing(WindowEvent we) {
                System.out.println("Window is closing.");
                // Close the window and exit the program
                dispose();  // Close the window
                System.exit(0);  // Exit the application
            }

            public void windowOpened(WindowEvent we) {
                System.out.println("Window opened.");
            }

            public void windowIconified(WindowEvent we) {
                System.out.println("Window minimized.");
            }

            public void windowDeiconified(WindowEvent we) {
                System.out.println("Window restored.");
            }

            public void windowActivated(WindowEvent we) {
                System.out.println("Window activated.");
            }

            public void windowDeactivated(WindowEvent we) {
                System.out.println("Window deactivated.");
            }
        });
    }

    public static void main(String[] args) {
        new HandlingWindowEventsDemo();
    }
}

