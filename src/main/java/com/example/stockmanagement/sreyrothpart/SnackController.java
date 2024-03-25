package com.example.stockmanagement.sreyrothpart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import com.example.stockmanagement.model.SwichScene;

public class SnackController {


    public AnchorPane SnackPage;
    @FXML
    private Label snackLabel;

    @FXML
    private TableView<?> tableView;

    @FXML
    private Button addButton;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button printButton;

    // You can add event handlers for the buttons here
    // For example:
    @FXML
    private void handleAddButtonAction() {
        // Logic to handle the "Add" button action
    }

    @FXML
    private void handleEditButtonAction() {
        // Logic to handle the "Edit" button action
    }

    @FXML
    private void handleDeleteButtonAction() {
        // Logic to handle the "Delete" button action
    }

    @FXML
    private void handlePrintButtonAction() {
        // Logic to handle the "Print" button action
    }

    public void handleBackButton(ActionEvent event) {
        new SwichScene(SnackPage, "Categorypage/Categorypage.fxml");
    }

    public void handleAddButton(ActionEvent event) {
        new SwichScene(SnackPage, "thidafxmlpart/add_page.fxml");

    }

    public void handleEditButton(ActionEvent event) {
        new SwichScene(SnackPage, "thidafxmlpart/edit_page.fxml");
    }
}
