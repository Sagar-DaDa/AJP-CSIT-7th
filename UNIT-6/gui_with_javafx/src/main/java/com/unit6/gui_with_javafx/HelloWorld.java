package com.unit6.gui_with_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    // Step 1: Extend Application and Override start() method
    @Override
    public void start(Stage stage) throws Exception {

        // Step 2: Create controls (e.g. Button)
        Button btn = new Button("Click Here");

        // Step 3: Create a Layout and add controls
        StackPane layout = new StackPane();
        layout.getChildren().add(btn);

        // Step 4: Create a Scene
        Scene scene = new Scene(layout, 300, 300);

        // Step 5: Prepare the Stage
        stage.setTitle("JavaFX Demo");
        stage.setScene(scene);
        stage.show();

        // Step 6: Create an Event for the Button
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello World!");
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
