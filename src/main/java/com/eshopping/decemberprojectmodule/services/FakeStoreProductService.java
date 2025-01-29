package com.eshopping.decemberprojectmodule.services;

import com.eshopping.decemberprojectmodule.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{


    @Override
    public Products getSingleProduct(Long id) {
        return null;
    }

    @Override
    public List<Products> getAllProducts() {
        return null;
    }

    @Override
    public Products Products(Long id, String title, String description, Double price, String imageUrl, Long categoryId) {
        return null;
    }
}
