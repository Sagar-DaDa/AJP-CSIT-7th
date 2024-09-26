package com.unit6.gui_with_javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationFX extends Application {
    public void start(Stage stage) {
        // Label for name
        Label nameLabel = new Label("Name");
        // Text field for name
        TextField nameText = new TextField();

        // Label for date of birth
        Label dobLabel = new Label("Date of Birth");
        // Date picker to choose date
        DatePicker datePicker = new DatePicker();

        // Label for gender
        Label genderLabel = new Label("Gender");
        // Toggle group of radio buttons
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("Male");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio = new RadioButton("Female");
        femaleRadio.setToggleGroup(groupGender);

        // Label for technologies known
        Label technologiesLabel = new Label("Technologies Known");
        // Check box for education
        CheckBox javaCheckBox = new CheckBox("Java");
        CheckBox dotnetCheckBox = new CheckBox("DotNet");

        // Label for education
        Label educationLabel = new Label("Educational Qualification");
        // List View for educational qualification
        ListView<String> edulist = new ListView<>();
        ObservableList<String> data = FXCollections.observableArrayList();
        data.addAll("BSc. CSIT", "BIT", "BCA", "BIM", "B.E. Computer");
        edulist.setItems(data);
        edulist.setPrefSize(100, 100);

        // Label for location
        Label locationLabel = new Label("Location");
        // Choice box for location
        ChoiceBox<String> locationChoiceBox = new ChoiceBox<>();
        locationChoiceBox.getItems().addAll("Kathmandu", "Lalitpur", "Bhaktpur", "Pokhara", "Banepa");

        // Button for registration
        Button buttonRegister = new Button("Register");

        // Creating a Grid Pane
        GridPane gridPane = new GridPane();
        // Setting size for the pane
        gridPane.setMinSize(500, 300);
        // Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        // Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        // Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        // Arranging all the nodes in the grid
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);
        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);
        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 2, 2);
        gridPane.add(technologiesLabel, 0, 3);
        gridPane.add(javaCheckBox, 1, 3);
        gridPane.add(dotnetCheckBox, 2, 3);
        gridPane.add(educationLabel, 0, 4);
        gridPane.add(edulist, 1, 4);
        gridPane.add(locationLabel, 0, 5);
        gridPane.add(locationChoiceBox, 1, 5);
        gridPane.add(buttonRegister, 2, 7);

        // Styling nodes
        buttonRegister.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        nameLabel.setStyle("-fx-font: normal bold 15px 'serif';");
        dobLabel.setStyle("-fx-font: normal bold 15px 'serif';");
        genderLabel.setStyle("-fx-font: normal bold 15px 'serif';");
        technologiesLabel.setStyle("-fx-font: normal bold 15px 'serif';");
        educationLabel.setStyle("-fx-font: normal bold 15px 'serif';");
        locationLabel.setStyle("-fx-font: normal bold 15px 'serif';");

        // Setting the background color
        gridPane.setStyle("-fx-background-color: BEIGE;");

        // Creating a scene object
        Scene scene = new Scene(gridPane);
        // Setting title to the Stage
        stage.setTitle("Registration Form");
        // Adding scene to the stage
        stage.setScene(scene);
        // Displaying the contents of the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

