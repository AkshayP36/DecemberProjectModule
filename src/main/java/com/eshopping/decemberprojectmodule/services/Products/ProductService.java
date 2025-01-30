package com.eshopping.decemberprojectmodule.services.Products;

import com.eshopping.decemberprojectmodule.models.Products.Products;

public interface ProductService {
    Products getSingleProduct(Long id);
    Products[] getAllProducts();
    Products createProduct(Long id, String title, String description, Double price, String imageUrl, String category);

    Products updateAProduct(Long id, String title, String description, Double price, String imageUrl, String category);

    Products deleteAProduct(Long id);
}
