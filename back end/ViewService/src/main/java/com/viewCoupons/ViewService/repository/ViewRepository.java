package com.viewCoupons.ViewService.repository;

import com.viewCoupons.ViewService.model.Coupons;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ViewRepository extends MongoRepository<Coupons,String> {
    List<Coupons> findByCouponName(String couponName);
}
