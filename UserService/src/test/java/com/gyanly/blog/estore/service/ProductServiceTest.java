package com.gyanly.blog.estore.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    String productName;
    String productType;
    String productId;

    @DisplayName("Creating product")
    @Test
    void testCreateProduct_whenDetailsNotFound_returnsProduct(){

        Product product = new Product(productName,productType,productId);


        //        Assert
        assertNotNull(product,"The createProduct() should return null ");
        assertEquals(productName,product.getProductName(),"Product name is incorrect");
        assertEquals(productType,product.getProductType(),"Product type is incorrect");

    }
}

