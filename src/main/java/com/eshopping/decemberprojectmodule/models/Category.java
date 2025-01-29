package com.eshopping.decemberprojectmodule.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Long categoryId;
    private String name;

    Category(){

    }
    Category(Long categoryId, String name){
        this.categoryId = categoryId;
        this.name = name;
    }
}
