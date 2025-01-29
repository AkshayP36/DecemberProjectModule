package com.eshopping.decemberprojectmodule.controllers;

import com.eshopping.decemberprojectmodule.models.Products;
import com.eshopping.decemberprojectmodule.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductsController {
    private static ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public static Products createProduct(@RequestBody Products product){
        Products response = productService.createProduct(product.getId(), product.getTitle(),
                product.getDescription(), product.getPrice(), product.getImageUrl(), product.getCategory().getName());
        return response;
    }

    @GetMapping("/products/{id}")
    public static Products getProductById(@PathVariable("id") Long id){
        Products products = productService.getSingleProduct(id);
        return products;
    }

    public static void updateProduct(Products product){

    }
    public static void deleteProductById(long productId){

    }
}
