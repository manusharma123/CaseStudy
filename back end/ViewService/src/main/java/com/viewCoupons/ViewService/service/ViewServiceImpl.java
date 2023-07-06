package com.viewCoupons.ViewService.service;

import com.viewCoupons.ViewService.model.Coupons;
import com.viewCoupons.ViewService.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewServiceImpl implements ViewService{
    @Autowired
    private ViewRepository viewRepository;

    @Override
    public List<Coupons> getCouponByName(String couponName) {

        return viewRepository.findByCouponName(couponName);
    }

    @Override
    public void deleteCoupon(String couponId) {
        viewRepository.deleteById(couponId);
    }

}
