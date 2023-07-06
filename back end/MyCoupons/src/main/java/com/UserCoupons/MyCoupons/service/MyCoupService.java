package com.UserCoupons.MyCoupons.service;

import com.UserCoupons.MyCoupons.exception.CouponNotFound;
import com.UserCoupons.MyCoupons.model.Coupons;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MyCoupService {

    List<Coupons> getMyCoupon()throws CouponNotFound;

    void deleteCoupon(String couponId)throws CouponNotFound;

    Coupons addMyCoupons(Coupons myCoupon);

    List<Coupons> getMyCouponByEmail(String email);
}
