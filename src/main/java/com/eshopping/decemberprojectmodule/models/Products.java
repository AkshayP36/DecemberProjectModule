package com.eshopping.decemberprojectmodule.models;

public class Products {
    private long id;
    private String title;
    private String description;
    private double price;
    private long categoryId;

    public Products() {
    }

    public Products(long id, String title, String description, double price, long categoryId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
    }
}
