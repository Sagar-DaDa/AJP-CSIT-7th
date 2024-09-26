package com.unit6.gui_with_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginPageFX extends Application {
    public void start(Stage stage) {
        // Creating label for email
        Text labelEmail = new Text("Email");
        // Creating label for password
        Text labelPassword = new Text("Password");

        // Creating TextField for email
        TextField textFieldEmail = new TextField();
        // Creating TextField for password
        PasswordField textFieldPassword = new PasswordField();

        // Creating Buttons
        Button buttonSubmit = new Button("Submit");
        Button buttonClear = new Button("Clear");
        buttonClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                textFieldEmail.clear();
                textFieldPassword.clear();
            }
        });

        // Creating a GridPane
        GridPane gridPane = new GridPane();

        // Setting size for the pane
        gridPane.setMinSize(400, 200);
        // Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        // Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        // Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        // Arranging all the nodes in the grid
        gridPane.add(labelEmail, 0, 0);
        gridPane.add(textFieldEmail, 1, 0);
        gridPane.add(labelPassword, 0, 1);
        gridPane.add(textFieldPassword, 1, 1);
        gridPane.add(buttonSubmit, 0, 2);
        gridPane.add(buttonClear, 1, 2);

        // Styling nodes
        buttonSubmit.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
        buttonClear.setStyle("-fx-background-color: white; -fx-text-fill: blue;");
        labelEmail.setStyle("-fx-font: normal bold 20px 'serif';");
        labelPassword.setStyle("-fx-font: normal bold 20px 'serif';");
        gridPane.setStyle("-fx-background-color: BEIGE;");

        // Creating a Scene object
        Scene scene = new Scene(gridPane);

        // Setting title to the Stage
        stage.setTitle("Login Page");
        // Adding scene to the stage
        stage.setScene(scene);
        // Displaying the contents of the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

