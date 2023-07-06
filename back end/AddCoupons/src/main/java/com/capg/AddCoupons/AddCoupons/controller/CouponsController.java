package com.capg.AddCoupons.AddCoupons.controller;

import com.capg.AddCoupons.AddCoupons.model.Coupons;
import com.capg.AddCoupons.AddCoupons.repository.CouponsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/addCoupons")
public class CouponsController {

    @Autowired
    private CouponsRepository CR;

    @PostMapping("/addCoupons")
    public ResponseEntity<?> addCoupons(@RequestBody Coupons cc){
        System.out.println(cc);
        Coupons res=CR.save(cc);
        System.out.println(res);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/viewCoupons")
    public ResponseEntity<?> getCoupons(){
        return ResponseEntity.ok(this.CR.findAll());
    }



}
