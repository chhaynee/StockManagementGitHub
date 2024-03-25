package com.example.stockmanagement.Categorypage;

import com.example.stockmanagement.model.SwichScene;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CategorypageVIewProduct implements Initializable {

    private static final String FILE_PATH = "Product.txt";
    private final ObservableList<Product> list = FXCollections.observableArrayList();
    public AnchorPane ViewProduct;

    @FXML
    private Label txtLabel;

    @FXML
    private Button btnAddProd;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDeleteProd;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnShowAll;

    @FXML
    private Button btnUpdateProd;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnProduct;

    @FXML
    private TableView<Product> productData;

    @FXML
    private TextField txtProdId;

    @FXML
    private TextField txtProdName;

    @FXML
    private TextField txtProdStock;

    @FXML
    private TextField txtProdType;

    @FXML
    private TextField txtProdPrice;

    @FXML
    private TableColumn<Product, String> ProdId;

    @FXML
    private TableColumn<Product, String> ProdName;

    @FXML
    private TableColumn<Product, String> ProdStocks;

    @FXML
    private TableColumn<Product, String> ProdType;

    @FXML
    private TableColumn<Product, String> ProdPrice;

    @FXML
    private TableColumn<Product, String> ProdPrice1; // Add this TableColumn

    @FXML
    protected void addOnClick() {
        Product product = new Product(txtProdId.getText(), txtProdName.getText(), txtProdType.getText(), txtProdStock.getText(), txtProdPrice.getText());
        addProduct(product);
        txtProdId.setText("");
        txtProdName.setText("");
        txtProdType.setText("");
        txtProdStock.setText("");
        txtProdPrice.setText("");
    }

    @FXML
    protected void removeOnClick() {
        try {
            removeProduct(txtProdId.getText());
            txtProdId.setText("");
        } catch (IOException e) {
            txtLabel.setText("Error: Failed to remove product");
        }
    }

    @FXML
    protected void updateOnClick() {
        try {
            updateProduct(txtProdId.getText(), txtProdName.getText(), txtProdType.getText(), txtProdStock.getText(), txtProdPrice.getText());
            txtProdId.setText("");
            txtProdName.setText("");
            txtProdType.setText("");
            txtProdStock.setText("");
            txtProdPrice.setText("");
        } catch (IOException e) {
            txtLabel.setText("Error: Failed to update product");
        }
    }

    @FXML
    protected void searchOnClick() {
        try {
            searchProduct(txtProdId.getText(), txtProdName.getText(), txtProdType.getText());
            txtProdId.setText("");
            txtProdName.setText("");
            txtProdType.setText("");
        } catch (IOException e) {
            txtLabel.setText("Error: Failed to search product");
        }
    }

    @FXML
    protected void displayTable() {
        try {
            loadData();
        } catch (FileNotFoundException e) {
            txtLabel.setText("Error: File not found");
        }
    }

    @FXML
    public void handleDashboradButton(ActionEvent event) {
        new SwichScene(ViewProduct, "hongfxmlpart/homepageview.fxml");
    }

    @FXML
    public void HandleViewProductButton(ActionEvent event) {
        new SwichScene(ViewProduct, "sreyrothfxmlpart/ProductDetailView.fxml");
    }

    @FXML
    public void HandleAddProdurctButton(ActionEvent event) {
        new SwichScene(ViewProduct, "thidafxmlpart/AddProduct.fxml");
    }

    public void addProduct(Product product) {
        if (product.getProdId().isEmpty() || product.getProdName().isEmpty() || product.getProdType().isEmpty() || product.getProdStocks().isEmpty() || product.getProdPrice().isEmpty()) {
            txtLabel.setText("Enter all the information to add product");
        } else {
            try (PrintWriter pw = new PrintWriter(new FileOutputStream("Product.txt", true))) {
                pw.println(product.getProdId() + "," + product.getProdName() + "," + product.getProdType() + "," + product.getProdStocks() + "," + product.getProdPrice());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initCols();
        try {
            loadData();
        } catch (FileNotFoundException e) {
            txtLabel.setText("Error: File not found");
        }
    }

    private void initCols() {
        ProdId.setCellValueFactory(new PropertyValueFactory<>("ProdId"));
        ProdName.setCellValueFactory(new PropertyValueFactory<>("ProdName"));
        ProdType.setCellValueFactory(new PropertyValueFactory<>("ProdType"));
        ProdStocks.setCellValueFactory(new PropertyValueFactory<>("ProdStocks"));
        ProdPrice.setCellValueFactory(new PropertyValueFactory<>("ProdPrice"));
        ProdPrice1.setCellValueFactory(new PropertyValueFactory<>("ProdPrice1")); // Add this line
    }

    public void loadData() throws FileNotFoundException {
        list.clear();
        Scanner scanner = new Scanner(new File(FILE_PATH));
        while (scanner.hasNextLine()) {
            String[] str = scanner.nextLine().split(",");
            list.add(new Product(str[0], str[1], str[2], str[3], str[4]));
        }
        productData.setItems(list);
        scanner.close();
    }

    public void removeProduct(String id) throws IOException {
        ArrayList<Product> products = readProducts();
        boolean found = false;

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);

            if (product.getProdId().equalsIgnoreCase(id)) {
                products.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            writeProducts(products);
            txtLabel.setText("Product ID: " + id + " has been deleted");
        } else if (txtProdId.getText().isEmpty()) {
            txtLabel.setText("Please enter an ID you want to remove");
        } else {
            txtLabel.setText("Product ID: " + id + " not found");
        }
        loadData();
    }

    private ArrayList<Product> readProducts() throws IOException {
        ArrayList<Product> products = new ArrayList<>();
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            return products;
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 5) {
                    String productId = parts[0];
                    String productName = parts[1];
                    String productType = parts[2];
                    String productStocks = parts[3];
                    String productPrice = parts[4];
                    products.add(new Product(productId, productName, productType, productStocks, productPrice));
                }
            }
        }

        return products;
    }

    private void writeProducts(ArrayList<Product> products) throws IOException {
        FileWriter writer = new FileWriter(FILE_PATH);

        for (Product product : products) {
            writer.write(product.getProdId() + "," + product.getProdName() + "," + product.getProdType() + "," + product.getProdStocks() + "," + product.getProdPrice() + "\n");
        }

        writer.close();
    }

    public void updateProduct(String id, String name, String type, String stock, String price) throws IOException {
        ArrayList<Product> products = readProducts();
        boolean found = false;

        for (Product product : products) {
            if (product.getProdId().equalsIgnoreCase(id)) {
                product.setProdId(id);
                product.setProdName(name);
                product.setProdType(type);
                product.setProdStocks(stock);
                product.setProdPrice(price);
                found = true;
                break;
            }
        }

        if (found) {
            writeProducts(products);
            txtLabel.setText("Product ID: " + id + " has been updated");
        } else if (txtProdId.getText().isEmpty()) {
            txtLabel.setText("Enter the ID and information you want to update");
        } else {
            txtLabel.setText("Product ID: " + id + " not found");
        }
        loadData();
    }

    public void searchProduct(String id, String name, String type) throws IOException {
        list.clear();
        ArrayList<Product> search = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return;
        }
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] str = scanner.nextLine().split(",");
            if (str[0].equalsIgnoreCase(txtProdId.getText()) || str[1].equalsIgnoreCase(txtProdName.getText()) || str[2].equalsIgnoreCase(txtProdType.getText())) {
                list.add(new Product(str[0], str[1], str[2], str[3], str[4]));
            }
        }
        productData.setItems(list);
        scanner.close();
    }
}
