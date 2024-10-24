package org.example.classroomdef.control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import org.example.classroomdef.model.Sex;
import org.example.classroomdef.model.UserAccount;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TableViewControl implements Initializable {

    @FXML
    private Label titleLabel;

    @FXML
    private TableColumn<UserAccount,String> firstColumn;

    @FXML
    private TableColumn<UserAccount,String> secondColumn;

    @FXML
    private TableColumn<UserAccount,String> thirdColumn;

    @FXML
    private TableColumn<UserAccount, Sex> fourthColumn;

    @FXML
    private  TableView<UserAccount> table;

    @FXML
    private TextField addName;

    @FXML
    private TextField addUser;

    @FXML
    private PasswordField addPassword;

    @FXML
    private TextField addSex;

    private Classroom classroom;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        classroom = Classroom.getInstance();

        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        firstColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        firstColumn.setCellFactory(TextFieldTableCell.<UserAccount>forTableColumn());
        firstColumn.setOnEditCommit(
                (TableColumn.CellEditEvent<UserAccount,String> event) -> {
                    ((UserAccount) event.getTableView().getItems().get(
                            event.getTablePosition().getRow())).setName(event.getNewValue());

                }
        );
        secondColumn.setCellValueFactory(new PropertyValueFactory<>("username"));
        secondColumn.setCellFactory(TextFieldTableCell.<UserAccount>forTableColumn());
        secondColumn.setOnEditCommit(
                (TableColumn.CellEditEvent<UserAccount,String> event) -> {
                    ((UserAccount) event.getTableView().getItems().get(
                            event.getTablePosition().getRow())).setUsername(event.getNewValue());

                }
        );

        thirdColumn.setCellValueFactory(new PropertyValueFactory<>("password"));

        fourthColumn.setCellValueFactory(new PropertyValueFactory<>("sex"));

        table.setItems(classroom.getAccounts());

    }

    public void addAccount(ActionEvent actionEvent) {

        String name = addName.getText();
        String username = addUser.getText();
        String password = addPassword.getText();
        int sex = Integer.parseInt(addSex.getText());

        classroom.addAccount(username, password, name, sex);

        addName.clear();
        addUser.clear();
        addPassword.clear();
        addSex.clear();
    }
}
