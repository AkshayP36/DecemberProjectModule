package com.eshopping.decemberprojectmodule.dto;

import com.eshopping.decemberprojectmodule.models.Category;
import com.eshopping.decemberprojectmodule.models.Products;

public class FakeStoreProductDto {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Products getProducts(){
        Products product = new Products();
        product.setId(this.id);
        product.setTitle(this.title);
        product.setDescription(this.description);
        product.setImageUrl(this.image);
        product.setPrice(this.price);

        Category cat = new Category();
        cat.setName(this.category);
        product.setCategory(cat);

        return product;
    }



    @Override
    public String toString() {
        return "FakeStoreProductDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

