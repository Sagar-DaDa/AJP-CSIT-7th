package dialogs;

import javax.swing.*;
import java.awt.*;

public class JProgressBarDemo extends JFrame {
    JProgressBar progressBar;

    public JProgressBarDemo() {
        // Frame setup
        setTitle("JProgressBar Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);  // Using null layout for custom positioning

        // JPanel to hold the progress bar
        JPanel progressPanel = new JPanel();
        progressPanel.setLayout(new BorderLayout());  // Layout for the panel
        progressPanel.setBounds(50, 50, 200, 50);    // Set position and size of the panel

        // Create a progress bar with range from 0 to 100
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);  // Set initial value
        progressBar.setStringPainted(true);  // Show percentage completed

        // Add the progress bar to the panel
        progressPanel.add(progressBar, BorderLayout.CENTER);

        // Add the panel to the frame
        add(progressPanel);

        // Set frame visibility after components are added
        setVisible(true);

        // Simulate progress task in a separate thread
        simulateProgress();
    }

    // Simulating a task that updates the progress bar
    private void simulateProgress() {
        new Thread(() -> {
            int progress = 0;
            while (progress <= 100) {
                progressBar.setValue(progress);  // Update the progress bar
                try {
                    Thread.sleep(100);  // Simulate time-consuming task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progress += 10;  // Increase progress by 10%
            }
        }).start();
    }

    public static void main(String[] args) {
        new JProgressBarDemo();
    }
}
