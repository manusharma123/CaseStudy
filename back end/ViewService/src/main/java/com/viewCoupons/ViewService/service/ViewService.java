package com.viewCoupons.ViewService.service;

import com.viewCoupons.ViewService.exception.CouponNotFound;
import com.viewCoupons.ViewService.model.Coupons;

import java.util.List;

public interface ViewService {

    List<Coupons> getCouponByName(String couponName);

    void deleteCoupon(String couponId)throws CouponNotFound;
}
