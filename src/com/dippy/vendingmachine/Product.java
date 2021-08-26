package com.dippy.vendingmachine;

public enum Product {
    COKE("Coke",25),
    PEPSI("Pepsi",35),
    SODA("Soda",45);


    private String productName;
    private int productPrice;

    Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }
}
