package com.eshopping.decemberprojectmodule.models;

public class Products {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Long categoryId;

    public Products() {
    }

    public Products(Long id, String title, String description, Double price, Long categoryId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
    }
}
