import java.awt.event.*;

class OuterClassEventHandler implements ActionListener {
    OuterClassEventHandling outerClassEventHandling;
    OuterClassEventHandler(OuterClassEventHandling e) {
        outerClassEventHandling = e;
    }
    public void actionPerformed(ActionEvent e) {
        outerClassEventHandling.lbl.setText("Hello, " + outerClassEventHandling.tf.getText());
    }
}