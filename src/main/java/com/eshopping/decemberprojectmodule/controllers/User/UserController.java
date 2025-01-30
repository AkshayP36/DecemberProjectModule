package com.eshopping.decemberprojectmodule.controllers.User;

import com.eshopping.decemberprojectmodule.models.User.User;
import com.eshopping.decemberprojectmodule.services.Users.FakeStoreUserService;
import com.eshopping.decemberprojectmodule.services.Users.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public User getAUser(@PathVariable("id") Long id){
        User user = userService.getAUser(id);
        return user;
    }
    @PostMapping("/users")
    public User addAUser(@RequestBody User user){
        User response = userService.addAUser(user.getEmail(), user.getUsername(), user.getName(),
                user.getName().getFirstname(), user.getName().getLastname(), user.getAddress(),
                user.getAddress().getCity(), user.getAddress().getStreet(),
                user.getAddress().getNumber(), user.getAddress().getZipcode(),
                user.getAddress().getGeolocation(), user.getAddress().getGeolocation().getLat(),
                user.getAddress().getGeolocation().getLongitude(), user.getPhone());
        return response;
    }

    @PutMapping("/users/{id}")
    public User updateAUser(@PathVariable("id") Long id, @RequestBody User user){
        User response = userService.updateAUser(id, user.getEmail(), user.getUsername(), user.getName(),
                user.getName().getFirstname(), user.getName().getLastname(), user.getAddress(),
                user.getAddress().getCity(), user.getAddress().getStreet(),
                user.getAddress().getNumber(), user.getAddress().getZipcode(),
                user.getAddress().getGeolocation(), user.getAddress().getGeolocation().getLat(),
                user.getAddress().getGeolocation().getLongitude(), user.getPhone());
        return response;
    }
    @DeleteMapping("/users/{id}")
    public User deleteAUser(@PathVariable("id") Long id){
        User response = userService.deleteAUser(id);
        return response;
    }
    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> response = userService.getAllUsers();
        return response;
    }

}
