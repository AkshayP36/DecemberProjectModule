package com.eshopping.decemberprojectmodule.services;

import com.eshopping.decemberprojectmodule.models.Products;

import java.util.List;

public interface ProductService {
    Products getSingleProduct(Long id);
    Products[] getAllProducts();
    Products createProduct(Long id, String title, String description, Double price, String imageUrl, String category);

    Products deleteAProduct(Long id);
}
