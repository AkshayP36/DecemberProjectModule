package com.eshopping.decemberprojectmodule.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String imageUrl;

    private Category category;

    public Products() {
    }

    public Products(Long id, String title, String description, Double price, String imageUrl, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.category = category;
    }
}
