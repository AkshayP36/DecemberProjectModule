package com.eshopping.decemberprojectmodule.controllers;

import com.eshopping.decemberprojectmodule.models.Products;
import com.eshopping.decemberprojectmodule.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductsController {
    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
//    @PostMapping("/products")
    public Products createProduct(@RequestBody Products product){
        Products response = productService.createProduct(product.getId(), product.getTitle(),
                product.getDescription(), product.getPrice(), product.getImageUrl(), product.getCategory().getName());
        return response;
    }

    @GetMapping("/products/{id}")
    public Products getProductById(@PathVariable("id") Long id){
        Products products = productService.getSingleProduct(id);
        return products;
    }

    @GetMapping("/products")
    public Products[] getAllProducts(){
        Products[] productsList= productService.getAllProducts();
        return productsList;
    }


    @PutMapping("/products/{id}")
    public Products updateProduct(@PathVariable("id") Long id, @RequestBody Products product){
        Products response = productService.updateAProduct(id, product.getTitle(), product.getDescription(), product.getPrice(), product.getImageUrl(),
                product.getCategory().getName());
        return response;
    }

    @DeleteMapping("/products/{id}")
    public Products deleteProductById(@PathVariable("id") long id){
        Products product = productService.deleteAProduct(id);
        return product;
    }
}
