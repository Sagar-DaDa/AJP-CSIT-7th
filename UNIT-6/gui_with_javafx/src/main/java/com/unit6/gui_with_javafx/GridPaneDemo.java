package com.unit6.gui_with_javafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class GridPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");

        // Create GridPane layout
        GridPane root = new GridPane();
        root.setPadding(new Insets(10)); // Padding around the GridPane
        root.setVgap(5); // Vertical gap between rows
        root.setHgap(5); // Horizontal gap between columns

        // Add buttons to the GridPane at specified positions
        root.add(btn1, 0, 0); // Button 1 at column 0, row 0
        root.add(btn2, 0, 1); // Button 2 at column 0, row 1
        root.add(btn3, 1, 0); // Button 3 at column 1, row 0
        root.add(btn4, 1, 1); // Button 4 at column 1, row 1
        root.add(btn5, 2, 0); // Button 5 at column 2, row 0

        // Create a Scene with the GridPane as root
        Scene scene = new Scene(root, 300, 200);

        // Set the Scene to the primaryStage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX GridPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}

