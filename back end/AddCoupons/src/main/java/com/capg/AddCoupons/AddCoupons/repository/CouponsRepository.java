package com.capg.AddCoupons.AddCoupons.repository;

import com.capg.AddCoupons.AddCoupons.model.Coupons;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CouponsRepository extends MongoRepository<Coupons,String> {
}
