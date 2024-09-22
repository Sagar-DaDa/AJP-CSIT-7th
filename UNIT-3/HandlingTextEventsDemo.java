import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class HandlingTextEventsDemo extends JFrame implements TextListener {
    TextField textField;
    Label label;

    public HandlingTextEventsDemo() {
        setTitle("Handling Text Events");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a TextField and Label
        textField = new TextField(20);
        label = new Label("Start typing...");

        // Add the TextField and Label to the Frame
        add(textField);
        add(label);

        // Register the TextListener for the TextField
        textField.addTextListener(this);

        setVisible(true);
    }

    // Handle text change event
    public void textValueChanged(TextEvent te) {
        // Update the label with the current text in the TextField
        label.setText("You typed: " + textField.getText());
    }

    public static void main(String[] args) {
        new HandlingTextEventsDemo();
    }
}

