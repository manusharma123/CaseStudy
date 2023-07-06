package com.Deal.DealService.repository;

import com.Deal.DealService.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void findAllByZomato() {
        List<Product> test = productRepository.findAllByPlatformName("ZOMATO");
        //assertAll(test).isTrue();
        int s = test.size();
        assertFalse(test.isEmpty());
    }

    @Test
    void findAllBySwiggy() {
        Product product = new Product();
        List<Product> test = productRepository.findAllByPlatformName("SWIGGY");
        //assertAll(test).isTrue();
        int s = test.size();
        assertFalse(test.isEmpty());
    }

    @Test
    void findAllByFlipkart() {
        Product product = new Product();
        List<Product> test = productRepository.findAllByPlatformName("FLIPKART");
        //assertAll(test).isTrue();
        int s = test.size();
        assertFalse(test.isEmpty());
    }

    @Test
    void findAllByAmazon() {
        Product product = new Product();
        List<Product> test = productRepository.findAllByPlatformName("AMAZON");
        //assertAll(test).isTrue();
        int s = test.size();
        assertFalse(test.isEmpty());
    }
}