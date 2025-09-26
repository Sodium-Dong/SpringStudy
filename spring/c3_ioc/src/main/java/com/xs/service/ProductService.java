package com.xs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductService productService;
    private StockService stockService;
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
