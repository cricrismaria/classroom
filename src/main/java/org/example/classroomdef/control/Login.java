package org.example.classroomdef.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import org.example.classroomdef.Main;

import java.io.IOException;

public class Login {

    @FXML
    private Label usernameLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Label passwordLabel;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Label errorManagament;

    private Classroom classroom;

    private Main main;

    public Login (){
        classroom = Classroom.getInstance();
        main = new Main();
    }


    public void onLoginAction(ActionEvent actionEvent) throws IOException {
        String username = usernameTextField.getText();
        String password = passwordField.getText();
        int loginResult = classroom.getAccount(username,password);

        switch (loginResult){
            case 0:
                errorManagament.setText("User not found. Please try again or sign up");
                errorManagament.setVisible(true);
                break;
            case 1:
                errorManagament.setText("Password incorrect");
                errorManagament.setTextFill(Color.rgb(210, 39, 30));
                errorManagament.setVisible(true);
                break;
            case 2:
                main.openWindow("account-list-view.fxml");
                break;

        }
    }
}
