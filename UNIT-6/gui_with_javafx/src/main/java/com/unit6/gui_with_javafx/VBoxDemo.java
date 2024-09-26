package com.unit6.gui_with_javafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class VBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // Create VBox layout with spacing
        VBox root = new VBox(5); // 5 pixels of spacing between buttons
        root.setPadding(new Insets(5)); // Padding around the VBox
        root.setAlignment(Pos.BASELINE_CENTER); // Align children to the center

        // Add buttons to the VBox
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);

        // Create a Scene with the VBox as root
        Scene scene = new Scene(root, 300, 200);

        // Set the Scene to the primaryStage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX VBox Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
