package com.eshopping.decemberprojectmodule.services.Users;

import com.eshopping.decemberprojectmodule.dto.User.FakeStoreUserDto;
import com.eshopping.decemberprojectmodule.models.User.Address;
import com.eshopping.decemberprojectmodule.models.User.Geolocation;
import com.eshopping.decemberprojectmodule.models.User.Name;
import com.eshopping.decemberprojectmodule.models.User.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FakeStoreUserService implements UserService{
    private RestTemplate restTemplate;

    public FakeStoreUserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public User getAUser(Long id) {
        FakeStoreUserDto fakeStoreUserDto = restTemplate.getForObject("https://fakestoreapi.com/users/"+id, FakeStoreUserDto.class);
        return fakeStoreUserDto.getUserData();
    }

    @Override
    public User addAUser(String email, String username, Name name, String firstname, String lastname,
                         Address address, String city, String street, Integer number, String zipcode,
                         Geolocation geolocation, String lat, String longitude, String phone) {

        FakeStoreUserDto fakeStoreUserDto = new FakeStoreUserDto();
        fakeStoreUserDto.setEmail(email);
        fakeStoreUserDto.setUsername(username);
        fakeStoreUserDto.setName(name);
        fakeStoreUserDto.setFirstname(firstname);
        fakeStoreUserDto.setLastname(lastname);
        fakeStoreUserDto.setAddress(address);
        fakeStoreUserDto.setCity(city);
        fakeStoreUserDto.setStreet(street);
        fakeStoreUserDto.setNumber(number);
        fakeStoreUserDto.setZipcode(zipcode);
//        fakeStoreUserDto.setGeolocation(geolocation);
        fakeStoreUserDto.setLat(lat);
        fakeStoreUserDto.setLongitude(longitude);
        fakeStoreUserDto.setPhone(phone);
        FakeStoreUserDto response = restTemplate.postForObject("https://fakestoreapi.com/users", fakeStoreUserDto, FakeStoreUserDto.class);
        return response.getUserData();
    }

    @Override
    public User updateAUser(Long id, String email, String username, Name name, String firstname, String lastname,
                         Address address, String city, String street, Integer number, String zipcode,
                         Geolocation geolocation, String lat, String longitude, String phone) {

        FakeStoreUserDto fakeStoreUserDto = new FakeStoreUserDto();
        fakeStoreUserDto.setEmail(email);
        fakeStoreUserDto.setUsername(username);
        fakeStoreUserDto.setName(name);
        fakeStoreUserDto.setFirstname(firstname);
        fakeStoreUserDto.setLastname(lastname);
        fakeStoreUserDto.setAddress(address);
        fakeStoreUserDto.setCity(city);
        fakeStoreUserDto.setStreet(street);
        fakeStoreUserDto.setNumber(number);
        fakeStoreUserDto.setZipcode(zipcode);
//        fakeStoreUserDto.setGeolocation(geolocation);
        fakeStoreUserDto.setLat(lat);
        fakeStoreUserDto.setLongitude(longitude);
        fakeStoreUserDto.setPhone(phone);
        restTemplate.put("https://fakestoreapi.com/users/"+id, fakeStoreUserDto, FakeStoreUserDto.class);
        FakeStoreUserDto response = restTemplate.getForObject("https://fakestoreapi.com/users/"+id, FakeStoreUserDto.class);
        return response.getUserData();
    }

    @Override
    public User deleteAUser(Long id) {
        FakeStoreUserDto fakeStoreUserDto = restTemplate.getForObject("https://fakestoreapi.com/users/"+id, FakeStoreUserDto.class);
        restTemplate.delete("https://fakestoreapi.com/users/"+id);
        return fakeStoreUserDto.getUserData();
    }


}
