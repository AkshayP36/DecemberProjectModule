package com.eshopping.decemberprojectmodule.services;

import com.eshopping.decemberprojectmodule.models.Products;

import java.util.List;

public interface ProductService {
    Products getSingleProduct(Long id);
    List<Products> getAllProducts();
    Products Products(Long id, String title, String description, Double price, String imageUrl, Long categoryId);
}
