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
    private String firstname;
    private String lastname;
    private String city;
    private String street;
    private Integer number;
    private String zipcode;
    private String lat;
    private String longitude;



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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public User getUserData() {
        User user = new User();
        user.setId(this.id);
        user.setEmail(this.email);
        user.setUsername(this.username);
        user.setName(this.name);
        user.setPhone(this.phone);
        user.setAddress(this.address);
        return user;
    }

}
