package com.eshopping.decemberprojectmodule.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private long categoryId;
    private String name;

    Category(){

    }
    Category(long categoryId, String name){
        this.categoryId = categoryId;
        this.name = name;
    }
}
