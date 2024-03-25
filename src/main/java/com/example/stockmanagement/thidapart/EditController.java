package com.example.stockmanagement.thidapart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import com.example.stockmanagement.model.SwichScene;

public class EditController {
    public AnchorPane editPage;
    @FXML
    private AnchorPane rootPane;

    @FXML
    private Label titleLabel;

    @FXML
    private Label idLabel;

    @FXML
    private TextField idTextField;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameTextField;

    @FXML
    private Label quantityLabel;

    @FXML
    private TextField quantityTextField;

    @FXML
    private Label priceInLabel;

    @FXML
    private TextField priceInTextField;

    @FXML
    private Label priceOutLabel;

    @FXML
    private TextField priceOutTextField;

    @FXML
    private Button cancelButton;

    @FXML
    private Button doneButton;

    @FXML
    public void initialize() {
        if (titleLabel != null) {
            // Set fonts for labels
            titleLabel.setFont(new Font(48));
            idLabel.setFont(new Font(25));
            nameLabel.setFont(new Font(225));
            quantityLabel.setFont(new Font(25));
            priceInLabel.setFont(new Font(25));
            priceOutLabel.setFont(new Font(25));

            // Set preferred sizes for text fields
            idTextField.setPrefSize(158, 43);
            nameTextField.setPrefSize(158, 43);
            quantityTextField.setPrefSize(158, 43);
            priceInTextField.setPrefSize(158, 43);
            priceOutTextField.setPrefSize(158, 43);

            // Set preferred sizes for buttons
            cancelButton.setPrefSize(96, 43);
            doneButton.setPrefSize(96, 43);
        } else {
            System.err.println("titleLabel is null. Check FXML file for proper injection.");
        }
    }

    public TextField getIdTextField() {
        return idTextField;
    }

    public TextField getNameTextField() {
        return nameTextField;
    }

    public TextField getQuantityTextField() {
        return quantityTextField;
    }

    public TextField getPriceInTextField() {
        return priceInTextField;
    }

    public TextField getPriceOutTextField() {
        return priceOutTextField;
    }

    public void handleCancelButton(ActionEvent event) {
        new SwichScene(editPage, "Categorypage/Categorypage.fxml");
    }

    public void HandleDoneButton(ActionEvent event) {
    }
}