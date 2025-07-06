package com.unit6.gui_with_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController extends Application {


    @FXML
    Button clickBtn;

    @FXML
    Label displayLabel;

    @FXML
    private void initialize() {
        // This method is called after FXML has been loaded
        clickBtn.setOnAction(event -> displayText());
    }

    @FXML
    private void displayText(){
        System.out.println("Hello World!");
        displayLabel.setText("Hello World!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);
        stage.setScene(scene);
        stage.setTitle("Scene Builder Example");
        stage.show();
    }
}
