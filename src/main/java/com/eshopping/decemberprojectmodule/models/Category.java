package com.eshopping.decemberprojectmodule.models;

import java.util.List;


public class Category {
    private Long categoryId;
    private String name;
    private List<Products> productsList;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

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

    public Category(){

    }
    Category(Long categoryId, String name){
        this.categoryId = categoryId;
        this.name = name;
    }
}
