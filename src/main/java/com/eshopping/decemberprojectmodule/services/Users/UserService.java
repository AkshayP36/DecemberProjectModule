package com.eshopping.decemberprojectmodule.services.Users;

import com.eshopping.decemberprojectmodule.models.User.Address;
import com.eshopping.decemberprojectmodule.models.User.Geolocation;
import com.eshopping.decemberprojectmodule.models.User.Name;
import com.eshopping.decemberprojectmodule.models.User.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


public interface UserService {
       public User getAUser(Long id);
       public User addAUser(String email, String username, Name name, String firstname, String lastname, Address address, String city, String street,
                            Integer number, String zipcode, Geolocation geolocation, String lat, String longitude, String phone);

       public User updateAUser(Long id, String email, String username, Name name, String firstname, String lastname, Address address, String city, String street,
                            Integer number, String zipcode, Geolocation geolocation, String lat, String longitude, String phone);

       public User deleteAUser(Long id);

}
