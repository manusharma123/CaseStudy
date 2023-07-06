package com.viewCoupons.ViewService.repository;

import com.viewCoupons.ViewService.model.Coupons;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ViewRepositoryTest {

    @Autowired
    private ViewRepository viewRepository;

    @Test
    void findByAmazon() {
        List<Coupons> test = viewRepository.findByCouponName("AMAZON");
        assertFalse(test.isEmpty());
    }

    @Test
    void findByFlipkart() {
        List<Coupons> test = viewRepository.findByCouponName("FLIPKART");
        assertFalse(test.isEmpty());
    }

    @Test
    void findBySwiggy() {
        List<Coupons> test = viewRepository.findByCouponName("SWIGGY");
        assertFalse(test.isEmpty());
    }

    @Test
    void findByZomato() {
        List<Coupons> test = viewRepository.findByCouponName("ZOMATO");
        assertFalse(test.isEmpty());
    }
}