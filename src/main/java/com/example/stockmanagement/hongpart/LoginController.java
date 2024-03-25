package com.example.stockmanagement.hongpart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import com.example.stockmanagement.model.SwichScene;

public class LoginController {

    @FXML
    private AnchorPane loginPage;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    private Stage stage; // Reference to the stage

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void handleLoginButton(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Check if the username and password match the expected values
        if (username.equals("admin") && password.equals("123")) {
            // Display login successful message
            showAlert("Login Successful", "Welcome, " + username + "!");
            // Load the next GUI
            new SwichScene(loginPage, "hongfxmlpart/homepageview.fxml");
        } else {
            // Display login failed message
            showAlert("Login Failed", "Invalid username or password. Please try again.");
        }
    }

    // Helper method to display an alert dialog
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
