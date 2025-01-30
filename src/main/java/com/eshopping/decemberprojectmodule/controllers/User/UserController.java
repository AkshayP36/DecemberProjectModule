package com.eshopping.decemberprojectmodule.controllers.User;

import com.eshopping.decemberprojectmodule.models.User.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public User getAUser(@PathVariable("id") Long id){
        return null;
    }
    public User addAUser(){
        return null;
    }
    public User updateAUser(){
        return null;
    }
    public User deleteAUser(){
        return null;
    }
    public User[] getAllUsers(){
        return null;
    }

}
