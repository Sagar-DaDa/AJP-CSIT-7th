package com.unit6.gui_with_javafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class HBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // Create HBox layout with spacing
        HBox root = new HBox(10); // 10 pixels of spacing between buttons
        root.setPadding(new Insets(5)); // Padding around the HBox
        root.setAlignment(Pos.BASELINE_RIGHT); // Align children to the right

        // Add buttons to the HBox
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);

        // Create a Scene with the HBox as root
        Scene scene = new Scene(root, 300, 200);

        // Set the Scene to the primaryStage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX HBox Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}

