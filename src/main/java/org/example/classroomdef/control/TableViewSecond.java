package org.example.classroomdef.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TableViewSecond {

    @FXML
    private Button addButton;

    @FXML
    private TableColumn<?, ?> codeColumn;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TableColumn<?, ?> scoreColumn;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TextField tfCode;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfScore;

    @FXML
    private Label txtCode;

    @FXML
    private Label txtName;

    @FXML
    private Label txtScore;

}

