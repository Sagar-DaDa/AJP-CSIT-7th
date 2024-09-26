package com.unit6.gui_with_javafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create buttons for each position
        Button btnTop = new Button("Top");
        Button btnBottom = new Button("Bottom");
        Button btnLeft = new Button("Left");
        Button btnRight = new Button("Right");
        Button btnCenter = new Button("Center");

        // Create a BorderPane layout
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(btnTop);        // Set the top node
        borderPane.setBottom(btnBottom);  // Set the bottom node
        borderPane.setLeft(btnLeft);      // Set the left node
        borderPane.setRight(btnRight);    // Set the right node
        borderPane.setCenter(btnCenter);   // Set the center node

        // Create a Scene with the BorderPane as root
        Scene scene = new Scene(borderPane, 400, 300);

        // Set the Scene to the primaryStage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX BorderPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX application
    }
}

