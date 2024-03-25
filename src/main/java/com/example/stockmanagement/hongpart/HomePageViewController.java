package com.example.stockmanagement.hongpart;

import com.example.stockmanagement.model.SwichScene;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

public class
HomePageViewController {

    public AnchorPane DashboardPage;

    public void adminBack(ActionEvent event) {
        new SwichScene(DashboardPage, "hongfxmlpart/login.fxml");
    }

    public void HandleViewProductButton(ActionEvent event) {
        new SwichScene(DashboardPage, "Categorypage/CategorypageVIewProduct.fxml");
    }

    public void HandleAddProdurctButton(ActionEvent event) {
        new SwichScene(DashboardPage, "thidafxmlpart/AddProduct.fxml");

    }

    public void HandleInvoiceButton(ActionEvent event) {
        new SwichScene(DashboardPage, "sreyrothfxmlpart/InvoiceView.fxml");
    }
}
