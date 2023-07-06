package com.UserCoupons.MyCoupons.service;

import com.UserCoupons.MyCoupons.exception.CouponNotFound;
import com.UserCoupons.MyCoupons.model.Coupons;
import com.UserCoupons.MyCoupons.repository.MyCouponsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyCoupServiceImpl implements MyCoupService{

    @Autowired
    private MyCouponsRepository myCouponsRepository;
    @Override
    public List<Coupons> getMyCoupon() throws CouponNotFound {
        return myCouponsRepository.findAll();
    }


    @Override
    public void deleteCoupon(String couponId) {
        myCouponsRepository.deleteById(couponId);
    }

    @Override
    public Coupons addMyCoupons(Coupons myCoupon) {
        Coupons res= myCouponsRepository.save(myCoupon);
        System.out.println(res);
        return res;
    }

    @Override
    public List<Coupons> getMyCouponByEmail(String email) {
        return myCouponsRepository.getAllCouponByEmail(email);
    }
}
