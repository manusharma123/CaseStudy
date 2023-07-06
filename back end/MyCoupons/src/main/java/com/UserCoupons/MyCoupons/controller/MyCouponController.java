package com.UserCoupons.MyCoupons.controller;

import com.UserCoupons.MyCoupons.exception.CouponNotFound;
import com.UserCoupons.MyCoupons.model.Coupons;
import com.UserCoupons.MyCoupons.service.MyCoupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/myCoupons")
public class MyCouponController {

    @Autowired
    private MyCoupService myCoupService;

    //fetching all the Coupons
    @GetMapping("/viewMyCoupons")
    public ResponseEntity<List<Coupons>> getMyCoupons() {
        try {
            return ResponseEntity.ok(myCoupService.getMyCoupon());

        } catch (CouponNotFound e) {
            return ResponseEntity.notFound().build();
        }
    }


    //add the Coupons for the users
    @PostMapping("/addMyCoupons")
    public ResponseEntity<?> addMyCoupons(@RequestBody Coupons myCoupon) {
        Coupons save = this.myCoupService.addMyCoupons(myCoupon);
        return ResponseEntity.ok(save);

    }

    //getting user coupons BY email
    @GetMapping("/viewByEmail")
    public ResponseEntity<?> getMyCouponByEmail(@RequestParam("email") String email){
        List<Coupons> coupon= myCoupService.getMyCouponByEmail(email);
        if(coupon.isEmpty()){
           System.out.println("no coupon bought yet");
        }
        return ResponseEntity.ok(coupon);
    }

    //deleting coupon by id
    @DeleteMapping("/deleteCoupons")
    public ResponseEntity<?> deleteCoupon(@RequestParam("couponId") String couponId){
        try {
            myCoupService.deleteCoupon(couponId);


        }catch(CouponNotFound e){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.noContent().build();
    }


}
