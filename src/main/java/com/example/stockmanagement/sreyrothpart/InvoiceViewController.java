package com.example.stockmanagement.sreyrothpart;

import com.example.stockmanagement.model.SwichScene;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class InvoiceViewController {
    public AnchorPane Invoice;
    public Button DashboardButton;
    public Button ViewProductButton;
    public Button AddProduchtButton;
    public Button InvoiceButton;

    public void handleDashboradButton(ActionEvent event) {
        new SwichScene(Invoice, "hongfxmlpart/homepageview.fxml");
    }

    public void HandleViewProductButton(ActionEvent event) {
        new SwichScene(Invoice, "Categorypage/CategorypageVIewProduct.fxml");
    }

    public void HandleAddProdurctButton(ActionEvent event) {
        new SwichScene(Invoice, "thidafxmlpart/AddProduct.fxml");
    }


    public void handlePrintInvoice(ActionEvent event) {
    }
}
