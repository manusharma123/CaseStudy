package com.viewCoupons.ViewService.controller;

import com.viewCoupons.ViewService.exception.CouponNotFound;
import com.viewCoupons.ViewService.model.Coupons;
import com.viewCoupons.ViewService.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/view")
public class ViewController {

    @Autowired
    private ViewService viewService;

    //searching coupon by name
    @GetMapping("/viewCoupons")
    public ResponseEntity<List<Coupons>> getCouponsByCouponName(@RequestParam("couponName") String couponName){
        return ResponseEntity.ok(viewService.getCouponByName(couponName));
    }

    //deleting coupon by Id
    @DeleteMapping("/deleteCoupons")
    public ResponseEntity<?> deleteCoupon(@RequestParam("couponId") String couponId){
        try {
             viewService.deleteCoupon(couponId);


        }catch(CouponNotFound e){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.noContent().build();
    }


}
