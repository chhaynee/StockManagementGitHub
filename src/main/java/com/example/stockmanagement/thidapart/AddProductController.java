package com.example.stockmanagement.thidapart;

import com.example.stockmanagement.model.SwichScene;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddProductController {
    public TextField TypeofProduct;
    public TextField NameProduct;
    public TextField IDProduct;
    public TextField QuantityProduct;
    public TextField PriceInProduct;
    public TextField PriceProduct;
    public AnchorPane AddProduct;
    public Button DashboardButton;
    public Button ViewProductButton;
    public Button AddProduchtButton;
    public Button InvoiceButton;

    public void handleDashboradButton(ActionEvent event) {
        new SwichScene(AddProduct, "hongfxmlpart/homepageview.fxml");
    }

    public void HandleViewProductButton(ActionEvent event) {
        new SwichScene(AddProduct, "Categorypage/CategorypageVIewProduct.fxml");

    }

    public void HandleAddProdurctButton(ActionEvent event) {
        new SwichScene(AddProduct, "thidafxmlpart/AddProduct.fxml");
    }

    public void HandleInvoiceButton(ActionEvent event) {
        new SwichScene(AddProduct, "sreyrothfxmlpart/InvoiceView.fxml");

    }

    public void handleAddProductButton(ActionEvent event) {
    }

    public void handleCancelButton(ActionEvent event) {
    }
}
