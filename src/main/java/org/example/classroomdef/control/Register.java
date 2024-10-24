package org.example.classroomdef.control;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import org.example.classroomdef.Main;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameTextField;

    @FXML
    private Label usernameLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Label passwordLabel;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Label sexLabel;

    @FXML
    private RadioButton femButton;

    @FXML
    private RadioButton mascButton;

    @FXML
    private Label profilePhoto;

    @FXML
    private Button photoButton;

    @FXML
    private Button signUpButton;

    private ToggleGroup genderToggleGroup;

    @FXML
    private Label errorManagament;

    private Classroom classroom;

    private Main main;

    private FileChooser fileChooser;

    private Desktop desktop;

    public Register () {
        classroom = Classroom.getInstance();
        main = new Main();
        genderToggleGroup = new ToggleGroup();
        fileChooser = new FileChooser();
        desktop = Desktop.getDesktop();
    }

    public void onSignUpAction(ActionEvent actionEvent) throws IOException {
        String name = nameTextField.getText();
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        int sex = femButton.isSelected() ? 1 : 2;

        femButton.setToggleGroup(genderToggleGroup);
        mascButton.setToggleGroup(genderToggleGroup);

        boolean result = classroom.existingUser(username);
        if (!result) {
            classroom.addAccount(username, password, name, sex);
            main.openWindow("table-view.fxml");
        } else {
            errorManagament.setText("User already exists");
            errorManagament.setVisible(true);
        }
    }
    /*

    public void openPhotos(ActionEvent actionEvent) {

        File file = fileChooser.showOpenDialog(stage);

    }



    private void openFile(File file) {
        EventQueue.invokeLater(() -> {
            try {
                desktop.open(file);
            } catch (IOException ex) {
                Logger.getLogger(FileChooserSample.
                                class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        });
    }

     */
}
