package com.example.stockmanagement.Categorypage;

public class Product {
    private String prodId;
    private String prodName;
    private String prodType;
    private String prodStocks;
    private String prodPrice;
    private String prodPrice1; // Add this field if required

    public Product(String prodId, String prodName, String prodType, String prodStocks, String prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodType = prodType;
        this.prodStocks = prodStocks;
        this.prodPrice = prodPrice;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdStocks() {
        return prodStocks;
    }

    public void setProdStocks(String prodStocks) {
        this.prodStocks = prodStocks;
    }

    public String getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(String prodPrice) {
        this.prodPrice = prodPrice;
    }

    // Add getter and setter for prodPrice1 if required

    @Override
    public String toString() {
        return prodId;
    }
}
