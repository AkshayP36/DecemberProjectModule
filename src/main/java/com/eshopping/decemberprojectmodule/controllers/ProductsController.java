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
        System.out.println
        Products response = productService.createProduct(product.getId(), product.getTitle(),
                product.getDescription(), product.getPrice(), product.getImageUrl(), product.getCategory().getName());
        return response;
    }

    @GetMapping("/products/{id}")
    public static Products getProductById(@PathVariable("id") Long id){
        Products products = productService.getSingleProduct(id);
        return products;
    }

    @GetMapping("/products")
    public static Products[] getAllProducts(){
        Products[] productsList= productService.getAllProducts();
        return productsList;
    }


    public static void updateProduct(Products product){

    }

    @DeleteMapping("/products/{id}")
    public static Products deleteProductById(@PathVariable("id") long id){
        Products product = productService.deleteAProduct(id);
        return product;
    }
}
