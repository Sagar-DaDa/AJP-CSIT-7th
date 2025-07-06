package com.unit6.gui_with_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class FileChooserDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button saveBtn = new Button("Save");
        saveBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                saveFile(primaryStage);
            }
        });

        Button openBtn = new Button("Open");
        openBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                openFile(primaryStage);
            }
        });

        FlowPane layout = new FlowPane(5,5);
        layout.getChildren().add(saveBtn);
        layout.getChildren().add(openBtn);

        Scene root = new Scene(layout, 500,400);

        primaryStage.setTitle("File Chooser Demo");
        primaryStage.setScene(root);
        primaryStage.show();


    }

    public void saveFile(Stage primaryStage){
        // Create a FileChooser instance
        FileChooser fileChooser = new FileChooser();

        // Set up for Save Dialog
        fileChooser.setTitle("Save File As");
        File saveFile = fileChooser.showSaveDialog(primaryStage);
        if (saveFile != null) {
            System.out.println("File saved: " + saveFile.getAbsolutePath());
        } else {
            System.out.println("File save canceled.");
        }
    }

    public void openFile(Stage primaryStage){
        // Create a FileChooser instance
        FileChooser fileChooser = new FileChooser();

        // Set the title of the dialog
        fileChooser.setTitle("Open Resource File");

        // Show Open Dialog
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        if (selectedFile != null) {
            System.out.println("File selected: " + selectedFile.getAbsolutePath());
        } else {
            System.out.println("File selection canceled.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

