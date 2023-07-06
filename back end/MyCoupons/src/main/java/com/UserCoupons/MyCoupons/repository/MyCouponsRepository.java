package com.UserCoupons.MyCoupons.repository;

import com.UserCoupons.MyCoupons.model.Coupons;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MyCouponsRepository extends MongoRepository<Coupons,String> {
    List<Coupons> getAllCouponByEmail(String email);
}
