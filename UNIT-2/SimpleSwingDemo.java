import java.awt.FlowLayout;

import javax.swing.*;

public class SimpleSwingDemo extends JFrame
{
	JButton b;
    JLabel label;
	SimpleSwingDemo()
	{
		setSize(500, 300);
		setTitle("Swing Demo");
        setLayout(new FlowLayout());
		label = new JLabel("Hello, CSIT 7th!");
		add(label);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		SimpleSwingDemo simpleSwingDemo = new SimpleSwingDemo();
	}
}