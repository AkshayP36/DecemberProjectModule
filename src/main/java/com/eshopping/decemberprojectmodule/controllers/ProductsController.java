package com.eshopping.decemberprojectmodule.controllers;

import com.eshopping.decemberprojectmodule.models.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @RequestMapping(value = "/product/13", method = RequestMethod.POST)
    public static void createProduct(Products product){

    }
    @GetMapping("/product")
    public static Products getProductById(long productId){
        return null;
    }
    public static void updateProduct(Products product){

    }
    public static void deleteProductById(long productId){

    }
}
