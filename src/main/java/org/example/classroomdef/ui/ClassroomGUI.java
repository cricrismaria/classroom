package org.example.classroomdef.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.example.classroomdef.Main;

import java.io.IOException;

public class ClassroomGUI {

    @FXML
    private Label welcomeText;

    @FXML
    private Label secondWelcomeText;

    @FXML
    private Button signUp;

    @FXML
    private Button login;

    Main main = new Main();


    @FXML
    public void onSignUpAction(ActionEvent actionEvent) throws IOException {
        main.openWindow("register-view.fxml");
    }

    @FXML
    public void onLoginAction(ActionEvent actionEvent) throws IOException {
        main.openWindow("login-view.fxml");
    }
}