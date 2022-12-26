package com.gyanly.blog.estore.service;

import java.util.UUID;

public class ProductServiceImpl implements ProductService{


    public UsersRepository Repository;


    public Product createProduct(String productName, String productType, String productId) {
        if(productName == null || productName.trim().length() == 0){
            throw new IllegalArgumentException("Product not found!!Sorry!!");
        }
        Product product = new Product(productName, productType,UUID.randomUUID().toString());

        return product;
    }
}
