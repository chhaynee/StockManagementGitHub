package com.example.stockmanagement.sreyrothpart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import com.example.stockmanagement.model.SwichScene;

public class DrinkController {

    public AnchorPane DrinkPage;
    @FXML
    private Label DrinkLabel;

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

    public Label getDrinkLabel() {
        return DrinkLabel;
    }

    public void setDrinkLabel(Label drinkLabel) {
        DrinkLabel = drinkLabel;
    }

    public TableView<?> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<?> tableView) {
        this.tableView = tableView;
    }

    public Button getAddButton() {
        return addButton;
    }

    public void setAddButton(Button addButton) {
        this.addButton = addButton;
    }

    public Button getEditButton() {
        return editButton;
    }

    public void setEditButton(Button editButton) {
        this.editButton = editButton;
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(Button deleteButton) {
        this.deleteButton = deleteButton;
    }

    public Button getPrintButton() {
        return printButton;
    }

    public void setPrintButton(Button printButton) {
        this.printButton = printButton;
    }

    public void setStage(Stage primaryStage ) {
    }

    public void handleBackButton(ActionEvent event) {
        new SwichScene(DrinkPage, "Mainpage/Categorypage.fxml");
    }

    public void handleAddButton(ActionEvent event) {
        new SwichScene(DrinkPage, "thidafxmlpart/add_page.fxml");
    }

    public void handleEditButton(ActionEvent event) {
        new SwichScene(DrinkPage, "thidafxmlpart/edit_page.fxml");
    }

    public void receiveDataFromAddController(String id, String name, String quantity, String priceIn, String priceOut) {
    }

    // You can add your controller logic here

}

