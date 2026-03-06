package edu.uno.csci2830.lab7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        // TODO 1: Create three TextFields:
        //         - nameField
        //         - numberField
        //         - emailField
		TextField nameField = new TextField();
		TextField numberField = new TextField();
		TextField emailField = new TextField();

        // TODO 2: Create a TextArea for output.
        //         Make it:
        //         - not editable
        //         - wrap text enabled
		TextArea outputTextArea = new TextArea();
		outputTextArea.setText("output");
		outputTextArea.setEditable(false);
		outputTextArea.setWrapText(true);


        // TODO 3: Create a Button labeled "Submit"
		Button submitButton = new Button("SUBMIT");


        // TODO 4: Create an instance of FormLogic
		FormLogic formLogic = new FormLogic();

        // TODO 5: When the button is clicked:
        //         - Read values from the three text fields
        //         - Call formatOutput(...)
        //         - Display result in the TextArea
        //
        // Example structure:
        submitButton.setOnAction(e -> {

            String output = formLogic.formatOutput(
                    nameField.getText(),
                    numberField.getText(),
                    emailField.getText()
            );

            outputTextArea.setText(output);
        });
        

        // TODO 6: Create a GridPane layout.
        //         - Add padding
        //         - Set horizontal and vertical gaps
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(10);
		grid.setVgap(10);

        // TODO 7: Add Labels and controls to the GridPane:
        //         Row 0: Name label + nameField
        //         Row 1: Number label + numberField
        //         Row 2: Email label + emailField
        //         Row 3: Submit button
        //         Row 4: Output label + TextArea
		Label nameLabel = new Label();
		nameLabel.setText("Name:");
		grid.add(nameLabel, 0, 0);
		grid.add(nameField, 1, 0);
		Label emailLabel = new Label();
		emailLabel.setText("Email:");
		grid.add(emailLabel, 0, 1);
		grid.add(emailField, 1, 1);
		Label numberLabel = new Label("Label:");
		numberLabel.setText("Number:");
		grid.add(numberLabel, 0, 2);
		grid.add(numberField, 1, 2);
		grid.add(submitButton, 0, 4);
		Label outputLabel = new Label("OUTPUT:");
		grid.add(outputLabel, 1, 3);
		grid.add(outputTextArea, 1, 4);

        // TODO 8: Create a Scene (suggested size: 520 x 360)
		Scene mainScene = new Scene(grid, 520, 360);

        // TODO 9: Set stage title, set scene, and call show()
		stage.setScene(mainScene);
		stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
