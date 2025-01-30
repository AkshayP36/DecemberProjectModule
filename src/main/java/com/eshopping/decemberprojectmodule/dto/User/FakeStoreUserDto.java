package com.eshopping.decemberprojectmodule.dto.User;

import com.eshopping.decemberprojectmodule.models.User.Address;
import com.eshopping.decemberprojectmodule.models.User.Name;
import com.eshopping.decemberprojectmodule.models.User.User;

public class FakeStoreUserDto {
    private Long id;
    private String email;
    private String username;
    private String password;
    private Name name;
    private Address address;
    private String phone;


    public FakeStoreUserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUserData() {
        User user = new User();
        user.setEmail(this.email);
        user.setUsername(this.username);
        user.setPhone(this.phone);
        return user;
    }

}
