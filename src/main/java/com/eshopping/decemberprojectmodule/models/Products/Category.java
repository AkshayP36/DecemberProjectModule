package com.eshopping.decemberprojectmodule.models.Products;

import java.util.List;


public class Category {

    private String name;
    private List<Products> productsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }
}
