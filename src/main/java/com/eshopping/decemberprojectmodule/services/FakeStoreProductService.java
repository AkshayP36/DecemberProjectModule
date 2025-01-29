package com.eshopping.decemberprojectmodule.services;

import com.eshopping.decemberprojectmodule.dto.FakeStoreProductDto;
import com.eshopping.decemberprojectmodule.models.Products;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Products getSingleProduct(Long id) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreProductDto.class);
        return fakeStoreProductDto.getProducts();
    }

    @Override
    public List<Products> getAllProducts() {
        return null;
    }

    @Override
    public Products createProduct(Long id, String title, String description, Double price, String imageUrl, String category) {
        FakeStoreProductDto fakeStoreProductDto = new FakeStoreProductDto();
        fakeStoreProductDto.setId(id);
        fakeStoreProductDto.setTitle(title);
        fakeStoreProductDto.setDescription(description);
        fakeStoreProductDto.setPrice(price);
        fakeStoreProductDto.setImage(imageUrl);
        fakeStoreProductDto.setCategory(category);
        FakeStoreProductDto response = restTemplate.postForObject("https://fakestoreapi.com/products", fakeStoreProductDto ,FakeStoreProductDto.class);
        return response.getProducts();
    }


}
