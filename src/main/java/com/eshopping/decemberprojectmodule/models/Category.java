package com.eshopping.decemberprojectmodule.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category {
    private Long categoryId;
    private String name;
    private List<Products> productsList;

    public Category(){

    }
    Category(Long categoryId, String name){
        this.categoryId = categoryId;
        this.name = name;
    }
}
