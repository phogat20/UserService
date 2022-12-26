package com.gyanly.blog.estore.service;

public class Product {
    private String productName;
    private String productType;

    private  String productId;


    public Product(String productName, String productType, String productId) {
        this.productName = productName;
        this.productType = productType;
        this.productId = productId;
    }



    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductId() {
        return productId;
    }
}
