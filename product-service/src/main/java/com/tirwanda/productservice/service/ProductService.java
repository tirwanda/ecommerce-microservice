package com.tirwanda.productservice.service;

import com.tirwanda.productservice.dto.ProductRequest;
import com.tirwanda.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProduct();
}
