package com.unit6.gui_with_javafx;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;  // Fixed import for FlowPane
import javafx.geometry.Insets;
import javafx.geometry.Orientation;

public class FlowPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("My Button 4");
        Button btn5 = new Button("This is Button 5");

        // Create a FlowPane with horizontal orientation
        FlowPane root = new FlowPane(Orientation.HORIZONTAL, 5, 5);
        root.setPadding(new Insets(5));

        // Add buttons to the FlowPane
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);

        // Create a Scene with the FlowPane as root
        Scene scene = new Scene(root, 300, 200);

        // Set the Scene to the primaryStage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX FlowPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX application
    }
}

